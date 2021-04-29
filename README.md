# build-package
## 一、引用maven动态参数
> 1.pom动态参数配置
>> 详见pom文件 profiles 标签

> 2.通过properties文件应用pom中的动态参数，再通过加载properties文件获取动态参数


## 二、指定私人maven仓库
> 详见pom文件中 repositories 标签

## 三、发布项目到私人仓库
> 详见pom中 distributionManagement 标签

## 四、三种打包方式
> 1.maven-jar-plugin maven-dependency-plugin
>>maven-jar-plugin将源码打包，maven-dependency-plugin将引用打包
>>> 源码打包为xxx.jar
>>
>>>引用打包到指定目录，一般为${project.build.directory}/lib下

> 2.maven-assembly-plugin
>> 会生成两个包，一个是源码包名字为 original-xxx.jar，即不包含引用的包，一个是包含引用的包 xxx.jar

> 3.maven-shade-plugin
>> 会生成两个包，一个是源码包，即不包含引用的包 xxx.jar，另一个是包含引用的包 名字为 xxx-jar-with-dependencies.jar

> 4.打包命令
>> mvn clean package -Pprod -Dmaven.test.skip=true
>>>  -P 指定打包环境
>>
>>>  -Dmaven.test.skip=true 指的是跳过test进行打包（不编译test部分）

