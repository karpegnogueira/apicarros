# apicarros
***By Karpeg Nogueira***

Api online no heroku pelo link: https://karpeg-apicarros.herokuapp.com/

#Instruções de instalação

O sistema conta com todos os recursos spring, podendo ser clonado através da url:

https://github.com/karpegnogueira/apicarros.git

após clonagem tradicional do git, pode ser aberto em qualqer IDE de preferencia.

Após iniciar caso queira chamar a aplicação use a porta 8080

#Instrução de Testes:

- após iniciar a aplicação é nescessário que vc faça sua autenticação através do curl: 
- ***api-online***
```
curl --location --request POST 'https://karpeg-apicarros.herokuapp.com/oauth/token' \
--header 'Authorization: Basic YXBpY2Fycm9zOmFwaWNhcnJvcw==' \
--form 'grant_type="password"' \
--form 'username="karpeg"' \
--form 'password="nogueira"'
```
- ***api-local***
```
curl --location --request POST 'https://localhost:8080/oauth/token' \
--header 'Authorization: Basic YXBpY2Fycm9zOmFwaWNhcnJvcw==' \
--form 'grant_type="password"' \
--form 'username="karpeg"' \
--form 'password="nogueira"'
```
- Voce receberá o seguinte retorno:
```
{
    "access_token": "c356dcd8-a469-42c1-86a9-d4f37620391d",
    "token_type": "bearer",
    "refresh_token": "65a04f4d-503b-427d-be26-d6ac063101d0",
    "expires_in": 43199,
    "scope": "password"
}
```

- copie todo retorno do "access_token", e useo nos seus requests da api como abaixo, use após o nome 'BEARER': 

-  #POST REQUEST - ENVIANDO DADOS DO DOCUMENTO CSV, ESTE, COMO EXEMPLO NA PASTA RAIZ DO PROJETO
- ***api-local***
```
curl --location --request POST 'localhost:8080/cars' \
--header 'Authorization: Bearer f3d00e77-85d3-48e8-a2cb-317159e1e758' \
--form 'file=@"/C:/Users/Karpeg/Desktop/TESTE.csv"'
```
- ***api-online***
```
curl --location --request POST 'https://karpeg-apicarros.herokuapp.com/oauth/token/cars' \
--header 'Authorization: Bearer f3d00e77-85d3-48e8-a2cb-317159e1e758' \
--form 'file=@"/C:/Users/Karpeg/Desktop/TESTE.csv"'
```

-  #GET REQUEST - BUSCANDO DADOS DE LISTA DE CARROS INSERIDA
- ***api-local***
```
curl --location --request GET 'localhost:8080/cars' \
--header 'Authorization: Bearer f3d00e77-85d3-48e8-a2cb-317159e1e758'
```
- ***api-online***
```
curl --location --request GET 'karpeg-apicarros.herokuapp.com/oauth/token/cars/cars' \
--header 'Authorization: Bearer f3d00e77-85d3-48e8-a2cb-317159e1e758''
```

