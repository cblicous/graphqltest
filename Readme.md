# H3 Simple GraphQL Test 

Goolged together from other tutorials 
currently first tries

Start with 
gradle bootRun 

acces http://localhost:8080/graphiql for queryinterface 

# H3 Example Query: 

{
  recentPosts(count:2,offset:0){ 
    title
    id
    text
    category
  }
}

# H3 Example Mutations

```
mutation {writePost(title:"Mei", text:"Kusakabe", category:"mei@totoro.com", author: "Author0") {
  id
} }
```

```
 mutation {createAuthor(input: { name : "test",thumbnail : "testthumb"}) { id } }
```
 
