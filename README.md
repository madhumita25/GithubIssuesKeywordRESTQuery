# GithubIssuesKeywordRESTQuery
Keyword-based Query Service for Github Repo Issues

This REST API provides a keyword-based lookup service for pre-indexed github issues. Issues are listed in descending order based on number of occurrences of the keyword.


## Deployment-only
### Prerequisites
* JRE 1.8+ 
* Tomcat 9 or equivalent
  1. Download: https://tomcat.apache.org/download-90.cgi
  2. Install: https://www.digitalocean.com/community/tutorials/how-to-install-apache-tomcat-8-on-ubuntu-16-04
  3. Fix permissions: https://superuser.com/questions/632618/best-practice-for-access-permission-to-users-for-apache-tomcat/825867
* Host the pipeline as described here @https://github.com/madhumita25/GithubIssuesIndexPipeline/ or copy the pre-existing index file keywordMap.ser)  in "/". 

  Notes
  1. For Linux, copying index in "/" is far from ideal; this is to avoid Tomcat permissions issues. This should really be any directory accessible in Tomcat CLASSPATH. Alternatively, you can provide an absolute path in QueryKeywordURL.java, rebuild & export a new war.
  2. On Windows, you can just put it in <TOMCAT_INSTALLATION_PATH>/bin


### Deployment
1. Download and copy war to relevant directory (e.g. $CATALINA_HOME/webapps)
2. Restart Tomcat ( or equivalent server), (or configure autoDeploy=true settings)

## Build and Deploy
### Prerequisites
* JDK 1.8+
* Maven 3
* Eclipse for exporting war (or equivalent). I did not try exporting war on Linux.

### Build
1. mvn package
2. Export war (Eclipse File > Export > Web > WAR File)
3. Follow Depoyment steps..








