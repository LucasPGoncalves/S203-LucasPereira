class Pai(object):
    nome = "Carlos"
    sobrenome = "Oliveira"
    residencia = "Ilha Bela"
    olhos = "Azuis"

class Filha(Pai):
    nome = "Luciana"
    olhos = "Castanhos"

class Neta(Filha):
    nome = "Maria"

print(
"Nome: " + Pai.nome + " " + Pai.sobrenome + "\n" + 
"Residencia: " + Pai.residencia + "\n" +
"Cor dos Olhos: " + Pai.olhos + "\n"
    )

print(
"Nome: " + Filha.nome + " " + Filha.sobrenome + "\n" + 
"Residencia: " + Filha.residencia + "\n" +
"Cor dos Olhos: " + Filha.olhos + "\n"
    )

print(
"Nome: " + Neta.nome + " " + Neta.sobrenome + "\n" + 
"Residencia: " + Neta.residencia + "\n" +
"Cor dos Olhos: " + Neta.olhos + "\n"
    ) 