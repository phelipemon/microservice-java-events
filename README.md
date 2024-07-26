# Event Microservice
API desenvolvida para demonstração de como **criar e integrar microserviços utilizando Java Spring**

## ☕ Tecnologias utilizadas

* Java
* Java Spring
* Banco de Dados H2 

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/phelipemon/microservice-java-events.git
```

2. Instale as dependências com Maven

3. Clone o repositório [Email Microservice](https://github.com/phelipemon/email-service-backend-uber) e siga suas instruções de instalação

```bash
git clone https://github.com/phelipemon/email-service-backend-uber.git
```

4. Ajuste o Email Microservice application.properties para rodar na porta `8090`

```yaml
server.port=8090
```

5. Execute ambos os Microserviços

## Como usar

1. Na IDE execute o arquivo EventsMicroserviceApplication
2. A API estará acessível em http://localhost:8080

## API Endpoints
A API fornece os seguintes endpoints:

**GET EVENTS**
```markdown
GET /events - Retorna uma lista de tods os eventos.
```
```json
[
  {
        "eventId": "c9078e42-2582-4937-b619-3786b6f74cb7",
        "maxParticipants": 20,
        "registeredParticipants": 0,
        "date": "14/09/2024",
        "title": "Front-End Day Fortaleza",
        "description": "Evento Tech em Fortaleza !"
    }
]
```

**GET UPCOMING EVENTS**
```markdown
GET /events/upcoming - Lista todos os eventos futuros que a data seja maior que a data atual.
```

```json
[
  {
        "eventId": "c9078e42-2582-4937-b619-3786b6f74cb7",
        "maxParticipants": 20,
        "registeredParticipants": 0,
        "date": "14/09/2024",
        "title": "Front-End Day Fortaleza",
        "description": "Evento Tech em Fortaleza !"
   }
]
```

**POST EVENT**
```markdown
POST /events - Registra um novo evento no App
```
```json
{   
    "maxParticipants": 20,
    "registeredParticipants": 0,
    "date": "14/09/2024",
    "title": "Front-End Day Fortaleza",
    "description": "Evento Tech em Fortaleza !"
}
```

**POST REGISTRATION**
```markdown
POST /events/${id}/register - Registra um usuário em um evento se este evento não estiver preenchido a máxima capacidade de participantes
```

```json
{
    "participantEmail": "phel.dev.projetos@gmail.com"
}
```

## Database
O projeto utiliza [H2 Database](https://www.h2database.com/html/tutorial.html) como banco de dados.

## Contato


<p>Feito por <b>Phelipe Reis</b>  :octocat: | - phel.dev@gmail.com

<a href="https://www.linkedin.com/in/phelipe-reis-3a11011a7/">Entre em contato</a></p>
