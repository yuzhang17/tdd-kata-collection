

- given flag exist in arg and mention in schema when get value should return correct value 

```
args("-l -p 8080 -d /usr/logs","l:bool p:int d:str")
```

- given flag not exist in arg and mention in schema when get value should return correct value 


- given the arguments do not match the schema,return good error message
  - arg type not correct

- given invalid schema format should return good error message

- given invalid args format should return good error message
