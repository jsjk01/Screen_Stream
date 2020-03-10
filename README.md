# Screen_Stream

相册（采用glideV4渲染）

## 仔细看吧，很简单的
添加依赖
> ```xml
> dependencies {
>     implementation 'com.github.bumptech.glide:glide:4.11.0'//glide图片加载依赖库
>     annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'//glide图片加载依赖库
> }
> ```
使用方法
> ```xml
> Glide.with(this).load(images[index]).into(imagesource);
> ```
