Wymagania:
Z racji, że nasza aplikacja pobiera praktycznie wszystkie informacje ze zdalnych
API, konieczne jest w większości modułów, by użytkownik miał dostęp do internetu
na urządzeniu mobilnym. W naszym programie istnieją elementy niewymagające
dostępu do sieci takie jak kompas i lista ulubionych (zapisanych) przez użytkow-
nika miejsc wartych do zwiedzenia. Do wszystkich pozostałych funkcjonalności bez
połączenia się nie obejdzie.
Kolejnym warunkiem jest dostęp do modułu GPS na urządzeniu mobilnym.
W przeciwnym wypadku informacje nie będą wyświetlane dla aktualnej lokaliza-
cji tylko w przypadku wyszukania miejsca po nazwie, a dla urządzenia z dostępem
do wspomnianego modułu informacje wyświetlane są automatycznie po udzieleniu
aplikacji pozwolenia do korzystania z lokalizacji. Podczas pierwszego uruchomienia
aplikacji pojawi się okno zezwoleń, w którym to użytkownik będzie mógł zdecydo-
wać czy udzielić aplikacji dostępu do dokładnej lokalizacji, czy przybliżonej i czy
zezwolenie ma dotyczyć dostępu zawsze w trakcie używania aplikacji, czy użytkow-
nik udziela jednorazowego dostępu lub nie udziela tego dostępu wcale.
Niezbędne pozwolenia udzielone aplikacji:
• access network state (dostep do stanu sieci),
• access fine location (dostęp do dokładnej lokalizacji),
• internet (dostęp do internetu).
Z racji, że nasza aplikacja pobiera praktycznie wszystkie informacje ze zdalnych
API, konieczne jest w większości modułów, by użytkownik miał dostęp do internetu
na urządzeniu mobilnym. W naszym programie istnieją elementy niewymagające
dostępu do sieci takie jak kompas i lista ulubionych (zapisanych) przez użytkow-
nika miejsc wartych do zwiedzenia. Do wszystkich pozostałych funkcjonalności bez
połączenia się nie obejdzie.
Kolejnym warunkiem jest dostęp do modułu GPS na urządzeniu mobilnym.
W przeciwnym wypadku informacje nie będą wyświetlane dla aktualnej lokaliza-
cji tylko w przypadku wyszukania miejsca po nazwie, a dla urządzenia z dostępem
do wspomnianego modułu informacje wyświetlane są automatycznie po udzieleniu
aplikacji pozwolenia do korzystania z lokalizacji. Podczas pierwszego uruchomienia
aplikacji pojawi się okno zezwoleń, w którym to użytkownik będzie mógł zdecydo-
wać czy udzielić aplikacji dostępu do dokładnej lokalizacji, czy przybliżonej i czy
zezwolenie ma dotyczyć dostępu zawsze w trakcie używania aplikacji, czy użytkow-
nik udziela jednorazowego dostępu lub nie udziela tego dostępu wcale.
Niezbędne pozwolenia udzielone aplikacji:
• access network state (dostep do stanu sieci),
• access fine location (dostęp do dokładnej lokalizacji),
• internet (dostęp do internetu).





Pierwsze uruchomienie aplikacji

Po zainstalowaniu aplikacji jej ikona pojawi się na ekranie głównym smartfona. Kliknięcie w ikonę spowoduje uruchomienie aplikacji. Podczas ładowania komponentów wyświetli się ekran powitalny z logiem aplikacji.

![image](https://github.com/user-attachments/assets/174a0554-2a16-4d9e-aa65-1729f1759121)

Po zakończeniu ładowania – jeśli użytkownik nie udzielił jeszcze zezwoleń na korzystanie z lokalizacji – pojawi się okno z prośbą o przyznanie uprawnień. Jeśli użytkownik wyrazi zgodę, aplikacja będzie mogła dostarczać informacje na temat aktualnej lokalizacji. W przypadku odmowy, przy każdej próbie uzyskania informacji o bieżącej lokalizacji pojawi się komunikat o braku uprawnień, ale nadal możliwe będzie wyszukiwanie lokalizacji ręcznie po nazwie.

![image](https://github.com/user-attachments/assets/e062f58c-f829-4eba-8138-c8be78376291)

Wyszukiwanie prognozy pogody

Po przejściu do modułu prognozy pogody, o ile udzielone zostały odpowiednie pozwolenia, załadowane zostaną dane pogodowe dla bieżącego dnia i lokalizacji użytkownika. Moduł ten jest dostępny poprzez ikonę domku na dolnym pasku nawigacji. Po każdym kliknięciu w ikonę użytkownik zostaje przeniesiony do ekranu prognozy pogody.

![image](https://github.com/user-attachments/assets/004234e2-8a12-4fa1-a0c3-5c779f0b3281)


Aby sprawdzić dodatkowe informacje, takie jak prędkość wiatru, ciśnienie i wilgotność, należy kliknąć w środkową kartę – spowoduje to jej obrót i wyświetlenie dodatkowych danych.

![image](https://github.com/user-attachments/assets/9c99f303-5ea7-4919-a352-975592285d99)


Możliwe jest również wyszukanie prognozy pogody dla dowolnego miejsca. W tym celu należy wpisać nazwę lokalizacji w polu tekstowym i kliknąć ikonę lupy. Podczas ładowania danych widoczne będzie obracające się koło, a po załadowaniu dane zostaną wyświetlone. W przypadku podania nieznanej lokalizacji pojawi się odpowiedni komunikat.

![image](https://github.com/user-attachments/assets/2d8def7a-df3c-4ec9-af5f-d7f952cbd935)


Aby sprawdzić prognozę na inny dzień, wystarczy kliknąć ikonę kalendarza w lewym górnym rogu i wybrać preferowany dzień. Dane zostaną załadowane automatycznie, a informacje o dacie będą widoczne pomiędzy kartą aktualnej pogody a listą prognoz godzinowych.

![image](https://github.com/user-attachments/assets/35852010-a99a-4d37-b356-46eeb85b04c8)


Najlepsze miejsca w okolicy

Moduł najlepszych miejsc pozwala na wyszukiwanie atrakcyjnych lokalizacji w danym obszarze. Po udzieleniu odpowiednich pozwoleń aplikacja automatycznie wyświetli listę miejsc znajdujących się w pobliżu aktualnej lokalizacji użytkownika. Można także wyszukać miejsca w wybranym obszarze, wpisując lokalizację w polu tekstowym i klikając ikonę lupy.

![image](https://github.com/user-attachments/assets/a44b2c93-cc1d-4666-94c9-4d4395091c6e)


Aby zawęzić wyszukiwanie, użytkownik może skorzystać z filtrów dostępnych w lewym górnym rogu aplikacji. Można tam ustawić typ miejsc, słowa kluczowe, promień przeszukiwania oraz zakres ocen Google, co pozwala na wyselekcjonowanie najlepiej ocenianych lokalizacji. Po zastosowaniu filtrów dane zostaną załadowane automatycznie.

![image](https://github.com/user-attachments/assets/d31ccdc1-ac05-4dee-88ba-4da97b3895a1)

Ulubione miejsca

Użytkownik ma możliwość zapisania swoich ulubionych miejsc. Aby dodać miejsce do listy ulubionych, wystarczy kliknąć ikonę serca na karcie wybranej lokalizacji. Po zapisaniu ikona zmieni się na wypełnione serce. Listę ulubionych miejsc można znaleźć w zakładce "Ulubione", gdzie są one przechowywane nawet bez dostępu do internetu. Usunięcie miejsca z listy odbywa się poprzez ponowne kliknięcie w ikonę serca.

Aby uzyskać więcej informacji o danej lokalizacji, użytkownik może kliknąć przycisk odwołania, który przeniesie go do szczegółowych danych w Google.

Nawigacja i funkcje mapy w aplikacji

Po wciśnięciu przycisku przenosimy się do wyszukiwarki, w której otwiera się odnośnik do Google Maps dla wskazanego miejsca. Możemy tam wyznaczyć trasę do wybranego obiektu, sprawdzić godziny otwarcia, opinie oraz galerie zdjęć. Aby powrócić do aplikacji, należy wybrać jej okno na panelu kart.

Sprawdzanie pogody na mapie

Aby sprawdzić pogodę na mapie, należy przejść do modułu mapy, klikając ikonę kuli ziemskiej na pasku nawigacji. Po wyświetleniu mapy wystarczy dotknąć dowolnego miejsca, aby pojawiły się trzy markery obrazujące pogodę dla danej lokalizacji. Wraz z przesuwaniem i skalowaniem mapy zmienia się położenie markerów.

Lokalizację można również wyszukać, wpisując jej nazwę w polu tekstowym i klikając ikonę lupy. Wyszukiwania są zapisywane w historii modułu i filtrowane, co umożliwia łatwe ponowne wyszukiwanie.

Dodawanie miejsc specjalnych

Klikając i przytrzymując palec na mapie, pojawia się znacznik z plusem oraz interfejs do dodania miejsca specjalnego (np. dom, praca). Znaczniki te służą do szybkiej nawigacji. W prawym dolnym rogu znajduje się przycisk otwierający menu nawigacji, gdzie można wybrać zapisane lokalizacje.

Dodane miejsca można również usunąć, klikając je na mapie.

Kompas i orientacja w terenie

Aplikacja posiada także kompas, który umożliwia wyznaczanie kierunków świata oraz orientację w terenie względem południka magnetycznego.

