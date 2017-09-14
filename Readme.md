Simple GraphQL Test 

Goolged together from other tutorials 
currently first tries

Start with 
gradle bootRun 

acces http://localhost:8080/graphiql for queryinterface 

Example Query: 

{
  recentPosts(count:2,offset:0){ 
    title
    id
    text
    category
  }
}

Example Mutation

mutation {writePost(title:"Mei", text:"Kusakabe", category:"mei@totoro.com", author: "Author0") {
  id
} }
 
