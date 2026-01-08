


def contador_likes(*likes_por_dia):
    
    suma = sum(likes_por_dia)
    media = suma / len(likes_por_dia)
    maximo = likes_por_dia.index(max(likes_por_dia)) + 1
        
    return suma, round(media), maximo
    
suma, media, dia = contador_likes(12, 34, 45, 56, 1, 3)

print(f"Total de likes: {suma} | media de likes: {media} | día con más likes: {dia}")
        
        
        