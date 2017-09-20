### Simple GraphQL Test 

Goolged together from other tutorials 
currently first tries

Start with 
gradle bootRun 

acces http://localhost:8080/graphiql for queryinterface 

### Example Query: 

{
  recentPosts(count:2,offset:0){ 
    title
    id
    text
    category
  }
}

### Example Mutations

```
mutation {writePost(title:"Mei", text:"Kusakabe", category:"mei@totoro.com", author: "Author0") {
  id
} }
```

```
 mutation {createAuthor(input: { name : "test",thumbnail : "testthumb"}) { id } }
```

### Docker Build

```
gradle build 

 docker run -p 8080:8081 cblicousgraphtest 
```
 

