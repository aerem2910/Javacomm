
Данный репозиторий служит всего лишь подготовкой к семинарскому занятию.
Описанные примеры по обработке исключений на языке java


Текстовое описание к первому заданию :
"
Классы исключений в Java используются для обработки ошибок и исключительных ситуаций в программе. Название класса исключения часто указывает на тип проблемы, которая возникла во время выполнения программы. Вот мои предположения о некоторых из перечисленных классов исключений:

ClassCastException - возникает, когда программа пытается привести объект к типу, который он не может иметь.
StackOverflowError - возникает, когда стек вызовов методов переполняется из-за слишком глубокой рекурсии.
IOError - этот класс исключений не существует в Java. Возможно, вы имели в виду IOError, который в Java отсутствует.
IOException - возникает при возникновении ошибок ввода-вывода, таких как проблемы с чтением или записью файлов.
NullPointerException - возникает, когда программа пытается обратиться к объекту, который не был инициализирован.
ConcurrentModificationException - возникает, когда коллекция модифицируется (например, добавляется или удаляется элемент) во время итерации по ней.
IllegalArgumentException - возникает, когда метод получает недопустимый аргумент.
EOFException - возникает при достижении конца файла при чтении данных.
ClassNotFoundException - возникает, когда программа пытается загрузить класс, который не существует.
ThreadDeath - этот класс исключений не существует в Java. Возможно, вы имели в виду ThreadDeath, который используется для завершения потока.
Вы можете проверить свои предположения, изучив иерархию классов исключений"