# Vue3



```
npm init vite@latest shuhui-manage-vue3 --template vue
npm install axios
npm install vue-router
npm install ant-design-vue@4.x --save
```

# Git



  ## 指令

```
git status  查看当前状态
```



## 问题

### 问题1

**描述**

fatal:Unable to create“.../.git/index.lock“ 的错误

**原因**

在进行某些比较费时的git操作时自动生成，操作结束后自动删除，相当于一个锁定文件，目的在于防止对一个目录同时进行多个操作。有时强制关闭进行中的git操作，这个文件没有被自动删除，之后你就无法进行其他操作，必须手动删除。

**解决**

说通俗点就是：我们在commit的时候，git会自动创建一个index.lock文件，操作完成后就会自动删除。但是如果在commit的时候出现误操作或者意外，那么就会导致这个文件不会自动删除，所以想要正常运行，就必须手动把这个文件删除，删除指令就是这个

```
rm -rf xxx/index.lock
```

按照上面讲的删除了这个文件以后，重复做了一遍commit和push的正确操作，github上的文件得到更新。
