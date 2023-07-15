# "Full-Stack" data project
## This project showcases different approaches in data consumption and data transform/loading
### To create this system, we need:
1. Data generator(we simulating and are not scraping real data)
2. Dockerize the whole infra(MinIO, Kafka(Brokers,Connect), Postgres)
3. Kafka logic for data validation rules
4. Write Kafka Consumer, Producer
5. Write Flink Streaming job for data transformation
6. Spark Batch jobs for MinIO data transformations and SparkSQL analytics
7. (Optional) Write React dashboard for data viz.
8. Srping Boot backend REST API

## Simple architecture diagram
![alt text](https://github.com/Sk00sha/MarketDataPipeline/blob/main/FullStackData.PNG)