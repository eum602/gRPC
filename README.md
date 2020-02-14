# gRPC examples #

## Introduction
* gRPC basic concepts and examples

## Requirements
* [protoc](https://github.com/eum602/Installer)
* Gradle 6.1.1 or later
* Optional: Intellij Idea 2019.3.3 or later

### Clone Repository ####

```shell
$ git clone https://github.com/eum602/gRPC.git
$ cd gRPC/
```

### Create python code ###
```shell
$ mdkir python
$ protoc -I=person --python_out=python person/job.proto
```