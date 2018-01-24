#Run the below commands:

cd /Users/AshishMAC/Spark


./bin/spark-submit --jars /Users/AshishMAC/Desktop/BigData_Project2/scopt_2.10-3.7.0.jar,/Users/AshishMAC/Desktop/BigData_Project2/spark-core_2.11-1.6.0.jar --class com.ashish.spark.dbscan.DbscanDriver --master local /Users/AshishMAC/Desktop/BigData_Project2/BigData_Project.jar --ds-master local --ds-jar /Users/AshishMAC/Desktop/BigData_Project2/BigData_Project.jar --ds-input /Users/AshishMAC/Desktop/BigData_Project2/cluster_vectors.csv --ds-output /Users/AshishMAC/Desktop/BigData_Project2/Output --eps 2 --numPts 3









//Run only to bet specific values regarding the CSV file
//TO GET EPS VALUE:
./bin/spark-submit --jars /Users/AshishMAC/Desktop/BigData_Project2/scopt_2.10-3.7.0.jar,/Users/AshishMAC/Desktop/BigData_Project2/spark-core_2.11-1.6.0.jar --class com.ashish.spark.dbscan.exploratoryAnalysis.DistanceToNearestNeighborDriver --master local /Users/AshishMAC/Desktop/BigData_Project2/BigData_Project.jar --ds-master local --ds-jar /Users/AshishMAC/Desktop/BigData_Project2/BigData_Project.jar --ds-input /Users/AshishMAC/Desktop/BigData_Project2/cluster_2d.csv --ds-output /Users/AshishMAC/Desktop/BigData_Project2/Output_eps



//TO GET NMPTS VALUE:
./bin/spark-submit --jars /Users/AshishMAC/Desktop/BigData_Project2/scopt_2.10-3.7.0.jar,/Users/AshishMAC/Desktop/BigData_Project2/spark-core_2.11-1.6.0.jar --class com.ashish.spark.dbscan.exploratoryAnalysis.NumberOfPointsWithinDistanceDriver --master local /Users/AshishMAC/Desktop/BigData_Project2/BigData_Project.jar --ds-master local --ds-jar /Users/AshishMAC/Desktop/BigData_Project2/BigData_Project.jar --ds-input /Users/AshishMAC/Desktop/BigData_Project2/cluster_2d.csv --ds-output /Users/AshishMAC/Desktop/BigData_Project2/Output_nmpts --eps 0.014
