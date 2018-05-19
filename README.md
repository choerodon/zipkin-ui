# zipkin-ui

zipkin UI Application.
## Feature

Track the zipkin version for iteration.
## Requirements

Combined with the choerodon-zipkin-collector, you can use it.
## To get the code

```Shell
git clone https://github.com/choerodon/zipkin-ui.git
```
## Installation and Getting Started

helm install choerodon-aliyun/choerodon-aliyun/zipkin-ui --version=0.5.0.RELEASE-dev.20180514171729

You can use the `--set env.open.foo_bar =foobar` to override the environment variables.

## Documentation

Replaceable variable：

|           variable        |  definition  |
| :-----------------------: | :----: |
| env.open.ZIPKIN_ELASTICSEARCH_HOST | es path |
| version | helm image version |



## Dependencies

|          Dependencies   |  version  |
| :---------------------: | :----: |
|         zipkin          | 1.31.3 |

## Reporting Issues

If you find any shortcomings or bugs, please describe them in the Issue.
    
## How to Contribute
Pull requests are welcome! Follow this link for more information on how to contribute.
