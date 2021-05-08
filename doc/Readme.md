# Get Started

## [Docker](docker.md)

## [Kubernetes](k8s.md)


## install eks

``` sh
aws eks create-cluster \
   --region ap-northeast-3 \
   --name sam-k8s \
   --kubernetes-version 1.19 \
   --role-arn arn:aws:iam::170247361816:role/SamEKSClusterRole \
   --resources-vpc-config subnetIds=subnet-06edba69971ba52eb,subnet-05da7488d91c81345,securityGroupIds=sg-a4d2c1ce
```
```sh

eksctl create nodegroup \
  --cluster sam-k8s \
  --region ap-northeast-3 \
  --name default \
  --node-type t2.medium \
  --nodes 4 \
  --nodes-min 4 \
  --nodes-max 4 \
  --ssh-access \
  --ssh-public-key nogada \
  --managed 
```

```sh
aws eks --region ap-northeast-2 update-kubeconfig --name htdp1-cluster-001
```

```sh

```