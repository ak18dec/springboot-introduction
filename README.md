# oss-summit-springboot
Springboot Demo for OSS Summit 2019

## Deploy to Openshift

- Build the application: `mvn clean package`
- Log into your Openshift instance: `oc login --token=XXXXXXXXXXXXXXXXXXXX --server=https://api.crc.testing:6443`
- Create binary build: `oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/phillip-kruger/oss-summit-springboot.git --name=springboot`
- Expose the HTTP endpoint: `oc expose svc/springboot`
- Check the rollout status: `oc rollout status -w dc/springboot`