from ast import Str


class Carro:
    _modelo = None
    _cor = None
    _ano = None

    def __init__(self, modelo, cor, ano):
        self._modelo = modelo
        self._cor = cor
        self._ano = ano

    def ligar():
        print('Ligando o carro...')
    
    def desligar():
        print('Desligando o carro...')

    def getModelo(self):
        return self._modelo

    def getCor(self):
        return self._cor        
    
    def getAno(self):
        return self._ano

    def __str__(self):
        return f'Modelo: {self._modelo}, Cor: {self._cor}, Ano: {self._ano}'