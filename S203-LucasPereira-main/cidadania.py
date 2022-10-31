class Pessoa(object):

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):

    def __init__(self, nome, sexo, idade, cpf):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf

cidadao = Cidadao(input("Insira o nome: "), input("Insira o sexo: "), input("Insira a idade: "), input("Insira o cpf: "))

print(
"Nome: " + cidadao.nome + "\n" +
"Sexo: " + cidadao.sexo + "\n" + 
"Idade: " + cidadao.idade + "\n" + 
"CPF: " + cidadao.cpf
)