# UML example

```mermaid
graph LR
  client -- http/https --> ingress
  subgraph cluster
  ingress -- offload --> service
  service --> pod#1
  service --> pod#2
  end

```