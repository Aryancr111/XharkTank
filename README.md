
# Crio XharkTank

A gamified platform for Crio XharkTank contestants to pitch their creative and amazing ideas! Got an idea to build the next Uber or the next Amazon? You think you have your idea has what it takes to get you to the moon 🚀 Then pitch your idea to the world! Investors can put up offers towards your pitch! 




## Pitch Model

![Pitch Model](https://i.imgur.com/SYgPSvg.png)
## Offer Model

![Offer Model](https://i.imgur.com/6o0ahKj.png)
## Tech Used

- Spring Boot 
- Java 11
- IntelliJ IDEA
- PostgreSQL
- Hibernate 
- Postman 

## API Endpoints

- `/pitches` to retrieve a list of all the pitches made, with the latest one showing first.
- `/pitches/{id}` to get the pitch of the specified ID or 404 not found. 
- `/pitches/{id}/makeOffer` to make an offer on an existing pitch. 
- `/pitches` to send a POST request to post a new pitch. 
