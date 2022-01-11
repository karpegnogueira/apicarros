# apicarros
***By Karpeg Nogueira***

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
    "access_token": "***c356dcd8-a469-42c1-86a9-d4f37620391d***",
    "token_type": "bearer",
    "refresh_token": "65a04f4d-503b-427d-be26-d6ac063101d0",
    "expires_in": 43199,
    "scope": "password"
}
```
