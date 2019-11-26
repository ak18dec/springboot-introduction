# oss-summit-springboot
Springboot example for the Microsoft OSS event

oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/phillip-kruger/oss-summit-springboot.git --name=springboot
oc expose svc/springboot