# nacos-provider-demo

## Create Config By Console
Login the console of MSE Nacos, then create config:
**Data ID**: config-demo.yml
**Group**: DEFAULT_GROUP
**Content**:
config:
  content: this is a nacos config demo

## RUN
mvn clean package -Dmaven.test.skip=true
## Test
curl -v http://localhost:9080/echo-provider