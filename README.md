# zipkin-ui

The UI part of zipkin Application.

[**Zipkin**](http://zipkin.io) is a distributed tracing system.
Show the monitoring data that have saved in elasticsearch.

## Feature

Track the zipkin version for iteration.
## Requirements

You shoule combined this project with the [**zipkin-collector**](https://github.com/choerodon/zipkin-collector). 
Make sure your zipkin-ui and zipkin-collector config the same elasticsearch.
## Installation and Getting Started

`helm install http://openchart.choerodon.com.cn/choerodon/devops/zipkin-ui --version=0.5.0`

You can use the `--set env.open.foo_bar =foobar` to override the environment variables.

## Documentation

Replaceable variable：

|           variable        |  definition  |
| :-----------------------: | :----: |
| env.open.ZIPKIN_ELASTICSEARCH_HOST | es address |
| version | helm image version |



## Dependencies

|          Dependencies   |  version  |
| :---------------------: | :----: |
|         zipkin          | 1.31.3 |
| zipkin-autoconfigure-ui | 1.28.0 |
| zipkin-server | 1.31.3 |
| zipkin-autoconfigure-storage-elasticsearch-http | 1.31.3 |
| choerodon-starter-hitoa | 0.5.0.RELEASE |

## Reporting Issues
If you find any shortcomings or bugs, please describe them in the [issue](https://github.com/choerodon/choerodon/issues/new?template=issue_template.md).
    
## How to Contribute
Pull requests are welcome! [Follow](https://github.com/choerodon/choerodon/blob/master/CONTRIBUTING.md) to know for more information on how to contribute.
