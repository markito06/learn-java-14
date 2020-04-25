#### Learn Java 14

###### jvm options

```bash
    --enable-preview -XX:+ShowCodeDetailsInExceptionMessages
```

 **--enable-preview** : To enable them, we must use the enable-preview argument, which enables all preview features at once. The Java compiler, as well as the JVM, must be of the same Java version that includes the preview feature we want to use.
 
 **-XX:+ShowCodeDetailsInExceptionMessages** : With this change the Helpful NullPointerExceptions of JEP 358 are printed per default. Also, we need to adapt the test that checks the default value, and two tests that check the wording of the NPE message.