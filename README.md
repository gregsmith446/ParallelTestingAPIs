# ParallelTestingAPIs

1.) Excel Data Provider  

Using XSSF row, sheet, workbook - send the necessary data to run the test cases.  
Done using the java class File Stream.    
Allows for dynamic testing - change the excel sheet and change the test.  

2.) Selenium / Docker / MYSQL  

This entire process runs with one click.  
Using testNG @BeforeTest creates the Docker container of Selenium grid with instance of Chrome and Firefox web drivers.  
Test data obtained via the excel file.  
Run two tests in parallel (but more if needed).  
Tests contain testNG assertion statements.  
If tests pass, continue.  
If fail, write failure message to MYSQL table.  
Using testNG @AfterTest, deconstructs the docker infrastructure and deletes log files.  

3.) Jenkins  

Once project is able to run locally, a Jenkins job can be created to run the job.  
Since the project can run autonomously, a jenkins job can run the job with a click or at a scheduled time.  
The jobs can also be added to a pipeline as part of a larger SDLC process.  
Example: if desired, the jenkins pipeline can contain a job that pushes the code to production/github if tests pass.  

