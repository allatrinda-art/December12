### Преобразование из double в int
***
Java не выполняет эту операцию автоматически.  

#### Самый простой способ преобразовать число с плавающей точкой в целое число — использовать **приведение типов**.
### Приведение типов
**Приведение типов так называется, потому что позволяет взять значение, принадлежащее одному типу, и "привести" его к другому типу.**

Синтаксис:   
double pi = 3.14;   
int x = (int) pi; // Таким образом, x получает значение 3

int x = 3;  
double x = (double) x; // Таким образом, x получает значение 3.0