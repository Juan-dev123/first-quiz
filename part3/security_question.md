Below, list by sections of the OWASP Top 10 for 2021 what I would do to make the system more secure:

**Broken Access control**
-	Verify API endpoint access permissions.
-	Verify access permissions to app screens or URLs.
-	Do not display additional information when a permit is denied.
-	Use the Deny by Default Principle.
-	Verify the principle of least privileges with the employees that are there at the moment, it may be that all programmers do not need full access to the system.
     
**Cryptographic failures**
-	Verify that there are no old or weak encryption algorithms or protocols.
-	Encrypt sensitive information such as passwords, credit card or personal user information such as address, and that these are not automatically decrypted when a request is made.
-	Ensure that the https protocol is used so that communication between clients and our servers is encrypted and not in plain text.
-	Verify that strong ciphers are being used in users' communication with the server.
-	Do not store sensitive information unnecessarily, discard it or delete it or get rid of it as soon as possible.
     
**Injection**
-	Validate the data provided by the user on the backend to avoid SQL injection and Cross Site Scripting.
-	Validate the data provided by the user on the frontend to avoid SQL injection and Cross Site Scripting.
-	Use an ORM in the Python backend for communication with the database.
     
**Security Misconfiguration**
-	Verify that unnecessary features are not installed or activated.
-	Verify that all accounts in the application do not have their default settings, for example, verify that the username and password to access the database is not the default one.
-	Be sure to use security headers in HTTP responses.
     
**Vulnerable and outdated components**
-	Verify that the packages we are using are not outdated or have been found to have any vulnerabilities, for this we can use tools such as owasp dependency check or dependabot.
     
**Identification and Authentication Failures**
-	Verify that no brute-force attacks can be made to log in, limiting the number of times a user can attempt to log in in a given time range.
-	Don't allow weak passwords or common passwords.
-	Check what the process of retrieving a password is like, for example, other than with questions such as what was the name of your first pet or what was the name of your elementary school teacher.
-	Verify that authentication is multi-factor.
-	Verify that sessions have a time limit.
     
**Security Logging and Monitoring Failures**
-	Do failed login monitoring.
-	Log application errors.
-	Back up logs to a cloud provider.
-	Track API usage to monitor it for suspicious or malicious activity.
-	Ensure that logs are generated in a format that can be easily consumed by a log management solution.
-	Ensure that log data is properly encoded.
