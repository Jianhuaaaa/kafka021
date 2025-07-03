# Apache Kafka

### Test Kafka message

http://localhost:8090/api/kafka/send?message=kafkaTest-003
http://localhost:8090/api/kafka/send?message=kafka测试-004

### Console Log

```html
2025-06-30T18:58:08.415+08:00  INFO 4156 --- [nio-8090-exec-1] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=producer-1] Instantiated an idempotent producer.
2025-06-30T18:58:08.444+08:00  INFO 4156 --- [nio-8090-exec-1] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.6.1
2025-06-30T18:58:08.444+08:00  INFO 4156 --- [nio-8090-exec-1] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 5e3c2b738d253ff5
2025-06-30T18:58:08.445+08:00  INFO 4156 --- [nio-8090-exec-1] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1751281088444
2025-06-30T18:58:08.459+08:00  INFO 4156 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: wBvMsrJLSyiHN9ZhP2Lc6Q
2025-06-30T18:58:08.460+08:00  INFO 4156 --- [ad | producer-1] o.a.k.c.p.internals.TransactionManager   : [Producer clientId=producer-1] ProducerId set to 2002 with epoch 0
2025-06-30T18:58:08.497+08:00  INFO 4156 --- [nio-8090-exec-1] c.j.kafka.controller.ProducerController  : 发送消息=kafkaTest-003
2025-06-30T18:58:08.596+08:00  INFO 4156 --- [ntainer#0-0-C-1] c.jsun.kafka.listener.ConsumerListener   : 接收消息=kafkaTest-003
2025-06-30T18:58:24.022+08:00  INFO 4156 --- [nio-8090-exec-4] c.j.kafka.controller.ProducerController  : 发送消息=kafka测试-004
2025-06-30T18:58:24.042+08:00  INFO 4156 --- [ntainer#0-0-C-1] c.jsun.kafka.listener.ConsumerListener   : 接收消息=kafka测试-004
```

### Swagger UI Document
http://localhost:8090/swagger-ui/index.html