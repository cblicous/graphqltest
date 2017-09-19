#H1 Simple GraphQL Test 

Goolged together from other tutorials 
currently first tries

Start with 
gradle bootRun 

acces http://localhost:8080/graphiql for queryinterface 

#H1 Example Query: 

{
  recentPosts(count:2,offset:0){ 
    title
    id
    text
    category
  }
}

#H1 Example Mutations

```
mutation {writePost(title:"Mei", text:"Kusakabe", category:"mei@totoro.com", author: "Author0") {
  id
} }
```

```
 mutation {createAuthor(input: { name : "test",thumbnail : "testthumb"}) { id } }
```
 
