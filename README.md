# Web3-Ant
Написать сценарий для утилиты Apache Ant, реализующий компиляцию, тестирование и упаковку в jar-архив кода проекта из лабораторной работы №3 по дисциплине "Веб-программирование".

Каждый этап должен быть выделен в отдельный блок сценария; все переменные и константы, используемые в сценарии, должны быть вынесены в отдельный файл параметров; MANIFEST.MF должен содержать информацию о версии и о запускаемом классе.

Cценарий должен реализовывать следующие цели (targets):

compile -- компиляция исходных кодов проекта.
build -- компиляция исходных кодов проекта и их упаковка в исполняемый jar-архив. Компиляцию исходных кодов реализовать посредством вызова цели compile.
clean -- удаление скомпилированных классов проекта и всех временных файлов (если они есть).
test -- запуск junit-тестов проекта. Перед запуском тестов необходимо осуществить сборку проекта (цель build).
xml - валидация всех xml-файлов в проекте.
team - осуществляет получение из svn-репозитория 3 предыдущих ревизий, их сборку (по аналогии с основной) и упаковку получившихся jar-файлов в zip-архив. Сборку реализовать посредством вызова цели build.
Вопросы к защите лабораторной работы:

Тестирование ПО. Цель тестирования, виды тестирования.
Модульное тестирование, основные принципы и используемые подходы.
Пакет JUnit, основные API.
Системы автоматической сборки. Назначение, принципы работы, примеры систем.
Утилита make. Make-файлы, цели и правила.
Утилита Ant. Сценарии сборки, цели и команды.
