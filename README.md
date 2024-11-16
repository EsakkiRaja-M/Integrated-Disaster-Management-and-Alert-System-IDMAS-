<h1>Integrated Disaster Management and Alert System (IDMAS)</h1>

<p>A comprehensive and automated solution for managing disaster-related activities, communication, and resources. Designed to streamline operations for administrators and users, IDMAS ensures efficient disaster preparedness, response, and recovery.</p>

<hr>

<h2>Table of Contents</h2>
<ol>
  <li><a href="#features">Features</a></li>
  <li><a href="#modules-overview">Modules Overview</a></li>
  <li><a href="#installation">Installation</a></li>
  <li><a href="#usage">Usage</a></li>
  <li><a href="#technologies-used">Technologies Used</a></li>
  <li><a href="#future-enhancements">Future Enhancements</a></li>
  <li><a href="#license">License</a></li>
  <li><a href="#acknowledgments">Acknowledgments</a></li>
</ol>

<hr>

<h2 id="features">Features</h2>

<ul>
  <li><strong>Automated Alerts:</strong> Sends email notifications to registered users for upcoming disaster exercises and events.</li>
  <li><strong>Dynamic Updates:</strong> Automatically updates disaster status in the database based on the end time set by administrators.</li>
  <li><strong>Resource Management:</strong> Allows tracking and categorization of available resources for disaster response.</li>
  <li><strong>User Engagement:</strong> Provides features for users to register for events, view disaster details, and access helpline contacts.</li>
  <li><strong>Secure Access:</strong> Includes login functionality for both administrators and users.</li>
</ul>

<hr>

<h2 id="modules-overview">Modules Overview</h2>

<h3>For Administrators:</h3>
<ul>
  <li><strong>Home Page:</strong> A dashboard providing quick access to all administrative functions.</li>
  <li><strong>Add Disaster:</strong> Allows admins to add disaster details such as type, severity, start/end times, and descriptions.</li>
  <li><strong>Add Available Resources:</strong> Enables the addition and management of resources for disaster response.</li>
  <li><strong>Add Events:</strong> Lets administrators schedule upcoming mock exercises and disaster events.</li>
  <li><strong>Alert Mail Sender:</strong> Sends email notifications to registered users about upcoming events and exercises.</li>
  <li><strong>User Management:</strong> Add new admin accounts, manage user accounts with roles and permissions.</li>
</ul>

<h3>For Users:</h3>
<ul>
  <li><strong>Home Page:</strong> A personalized dashboard displaying disaster-related information.</li>
  <li><strong>Helpline Contacts:</strong> Access to emergency contact details.</li>
  <li><strong>Register for Events:</strong> Users can register for disaster exercises and events.</li>
  <li><strong>New User Registration:</strong> Allows new users to sign up.</li>
  <li><strong>View Available Resources:</strong> Displays details of resources available for disaster response.</li>
  <li><strong>View Disaster Information:</strong> Provides real-time updates on ongoing or upcoming disasters.</li>
</ul>

<hr>

<h2 id="installation">Installation</h2>

<h3>Prerequisites</h3>
<ul>
  <li><strong>Java Development Kit (JDK)</strong></li>
  <li><strong>NetBeans IDE</strong></li>
  <li><strong>MySQL Database</strong></li>
  <li><strong>SMTP Server or Email Configuration</strong> for sending alerts.</li>
</ul>

<h3>Setup Steps</h3>
<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/your-username/IDMAS.git
cd IDMAS</code></pre>
  </li>
  <li>Import the project into NetBeans IDE.</li>
  <li>Configure the database connection in the application. Update the connection string with your MySQL database details.</li>
  <li>Import the SQL script (<code>database_schema.sql</code>) into your MySQL server to set up the required tables.</li>
  <li>Set up email credentials in the application's configuration file for sending alert emails.</li>
  <li>Run the application from NetBeans.</li>
</ol>

<hr>

<h2 id="usage">Usage</h2>

<h3>Administrator Workflow:</h3>
<ul>
  <li><strong>Login:</strong> Access the admin panel securely.</li>
  <li><strong>Add Disaster/Event:</strong> Enter disaster or event details for users to view and engage with.</li>
  <li><strong>Send Alerts:</strong> Notify registered users about scheduled events via email.</li>
  <li><strong>Monitor Resources:</strong> Update available resources in real time for effective disaster management.</li>
</ul>

<h3>User Workflow:</h3>
<ul>
  <li><strong>Register:</strong> Create a new account to access system features.</li>
  <li><strong>Event Registration:</strong> Sign up for upcoming disaster exercises.</li>
  <li><strong>View Information:</strong> Access detailed disaster-related data and available resources.</li>
  <li><strong>Helpline Access:</strong> Use emergency contact information during crises.</li>
</ul>

<hr>

<h2 id="technologies-used">Technologies Used</h2>

<ul>
  <li><strong>Frontend:</strong> Java Swing for desktop-based GUI.</li>
  <li><strong>Backend:</strong> Java for business logic and MySQL for database management.</li>
  <li><strong>Database:</strong> MySQL, configured for dynamic updates and secure data storage.</li>
  <li><strong>Email Alerts:</strong> SMTP protocol for automated alert notifications.</li>
  <li><strong>Development Tools:</strong> NetBeans IDE for coding and debugging.</li>
</ul>

<hr>

<h2 id="future-enhancements">Future Enhancements</h2>

<ul>
  <li><strong>Mobile Integration:</strong> Develop a mobile app for broader accessibility.</li>
  <li><strong>Real-Time Data:</strong> Integrate APIs to fetch and display live disaster information.</li>
  <li><strong>Resource Optimization:</strong> Implement AI to predict and allocate resources based on disaster severity.</li>
  <li><strong>Analytics Dashboard:</strong> Provide detailed analytics on past disasters, resource utilization, and user engagement.</li>
  <li><strong>Multi-Language Support:</strong> Add support for multiple languages to enhance usability.</li>
</ul>

<hr>

<h2 id="license">License</h2>

<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>

<hr>

<h2 id="acknowledgments">Acknowledgments</h2>

<p>We express our gratitude to all contributors and collaborators for their efforts in making this project a success. Special thanks to the developers, testers, and mentors who provided guidance throughout the development process.</p>
