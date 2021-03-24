### Gerar o build do java ###
./mvnw package && java -jar target/validarCPF.jar

### Gerar o build do docker
docker build -t concreteanaamarante/validador-cpf-java -f Dockerfile .

### Rodar imagem docker e gravar localmente ###
docker run -d -p 8081:8080 --name validador-cpf-java concreteanaamarante/validador-cpf-java

### Gerar tag ###
docker tag concreteanaamarante/validador-cpf-java

### Push da imagem para o dockerhub ###
docker push concreteanaamarante/validador-cpf-java