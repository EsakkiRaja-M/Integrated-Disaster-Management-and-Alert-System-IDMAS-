/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package home;

/**
 *
 * @author esakk
 */

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class StatusScheduler {
    private Timer timer;
    private int disasterId;

    public StatusScheduler(int disasterId, Date endTime) {
        this.disasterId = disasterId;
        timer = new Timer();
        long delay = endTime.getTime() - System.currentTimeMillis();
        
        if (delay < 0) {
            // Show a popup message for the exception
            JOptionPane.showMessageDialog(null, "End time cannot be in the past. Negative delay is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        timer.schedule(new UpdateStatusTask(), delay);
    }

    class UpdateStatusTask extends TimerTask {
        public void run() {
            updateStatus();
            timer.cancel();
        }

        private void updateStatus() {
            try {
                Connection con = ConnectionProvider.getCon();
                String query = "UPDATE dis_info SET STATUS = 'ENDED' WHERE ID = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, disasterId);
                pstmt.executeUpdate();
                con.close();
                // Show a popup message for successful status update
                JOptionPane.showMessageDialog(null, "Status updated to 'ENDED' for disaster ID: " + disasterId, "Update Successful", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                // Show a popup message for SQL exception
                JOptionPane.showMessageDialog(null, "An error occurred while updating the status: " + e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
}
