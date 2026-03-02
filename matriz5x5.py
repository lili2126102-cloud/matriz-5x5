# 1. Crear matriz 5x5 empezando en 0
matriz = [[0 for _ in range(5)] for _ in range(5)]

# 2. Ingreso los datos
print("--- Ingreso de datos para la Matriz 5x5 (Python) ---")
for i in range(5):
    for j in range(5):
        valor = int(input(f"Ingrese valor para [{i}][{j}]: "))
        matriz[i][j] = valor

# 3. Mostrar la matriz en forma de tabla
print("\nMatriz ingresada:")
for i in range(5):
    for j in range(5):
        print(matriz[i][j], end="\t")
    print() # Salto de línea

# 4. Aplanado
print("-" * 20)
lista_aplanada = []
for fila in matriz:
    for columna in fila:
        lista_aplanada.append(columna)
print("Matriz aplanada (lista):", lista_aplanada)