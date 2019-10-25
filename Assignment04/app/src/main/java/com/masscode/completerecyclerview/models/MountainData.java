package com.masscode.completerecyclerview.models;

import java.util.ArrayList;

public class MountainData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"A",
                    "Andrew Minai",
                    "https://pbs.twimg.com/media/DzpFiIfWwAEjZ8z.jpg",
                    "Despite the struggles Andrew Minai is a person who is willing to keep on pushing forward and never give up.",
                    "Age 20"},
            {"B",
                    "Bacon",
                    "https://www.simplyrecipes.com/wp-content/uploads/2019/08/baked-bacon-Lead-1.jpg",
                    "Bacon is a food that derives from Pigs",
                    "Origin: Unknown"},
            {"C",
                    "Car",
                    "https://amp.businessinsider.com/images/592f4169b74af41b008b5977-750-563.jpg",
                    "a road vehicle, typically with four wheels, powered by an internal combustion engine and able to carry a small number of people.",
                    "Nepal and India"},
            {"D",
                    "Dog",
                    "https://cdn.pixabay.com/photo/2016/12/13/05/15/puppy-1903313__340.jpg",
                    "Lhotse is the fourth highest mountain in the world at 8,516 metres (27,940 ft), after Mount Everest, K2, and Kangchenjunga. Part of the Everest massif, Lhotse is connected to the latter peak via the South Col. Lhotse means “South Peak” in Tibetan. In addition to the main summit at 8,516 metres (27,940 ft) above sea level, the mountain comprises the smaller peaks Lhotse Middle (East) at 8,414 m (27,605 ft), and Lhotse Shar at 8,383 m (27,503 ft). The summit is on the border between Tibet of China and the Khumbu region of Nepal.",
                    "Nepal and China"},
            {"E",
                    "Economy",
                    "https://www.bcatoday.org/wp-content/uploads/2018/09/economygrowth.jpg",
                    "the wealth and resources of a country or region, especially in terms of the production and consumption of goods and services.",
                    "United States"},
            {"F",
                    "Farm",
                    "https://images.pexels.com/photos/248880/pexels-photo-248880.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",

                    "Cho Oyu is the sixth-highest mountain in the world at 8,188 metres (26,864 ft) above sea level. Cho Oyu means \"Turquoise Goddess\" in Tibetan. The mountain is the westernmost major peak of the Khumbu sub-section of the Mahalangur Himalaya 20 km west of Mount Everest. The mountain stands on the China–Nepal border. Just a few kilometres west of Cho Oyu is Nangpa La (5,716m/18,753 ft), a glaciated pass that serves as the main trading route between the Tibetans and the Khumbu's Sherpas. This pass separates the Khumbu and Rolwaling Himalayas. Due to its proximity to this pass and the generally moderate slopes of the standard northwest ridge route, Cho Oyu is considered the easiest 8,000 metre peak to climb. It is a popular objective for professionally guided parties.",
                    "Nepal and China"},
            {"G",
                    "Gas",
                    "Gas-a substance or matter in a state in which it will expand freely to fill the whole of a container, having no fixed shape (unlike a solid) and no fixed volume (unlike a liquid).",
                    "The Dhaulagiri massif in Nepal extends 120 km (70 mi) from the Kaligandaki River west to the Bheri. This massif is bounded on the north and southwest by tributaries of the Bheri River and on the southeast by the Myagdi Khola. Dhaulagiri I is the seventh highest mountain in the world at 8,167 metres (26,795 ft) above sea level, and the highest mountain within the borders of a single country (Nepal). It was first climbed on 13 May 1960 by a Swiss/Austrian/Nepali expedition.",
                    "Nepal"},
            {"H",
                    "Hair",
                    "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/hbz-thick-hair-gettyimages-1035491002.jpg",
                    "Hair is a attribute apart of the human body",
                    "Human"},
            {"I",
                    "Iron",
                    "https://images-na.ssl-images-amazon.com/images/I/A12n-EVo2VL.jpg",
                    "form a mental image or concept of.",
                    "Pakistan"},
            {"J",
                    "Jeans",
                    "https://lp2.hm.com/hmgoepprod?set=source[/53/85/53853e48b94dad2f27687cba6c49e89ddad6b723.jpg],origin[dam],category[ladies_jeans_skinny_skinnyhigh],type[DESCRIPTIVESTILLLIFE],hmver[1]&call=url[file:/product/zoom]&zoom=zoom",
                    "Jeans is a set of clothes that you wear",
                    "Nepal"},
            {"K",
                    "King",
                    "https://previews.123rf.com/images/tigatelu/tigatelu1507/tigatelu150700006/42505485-cartoon-king-holding-a-golden-scepter.jpg",
                    "King is the person that rules over a kingdom",
                    "United Kingdom"},

            {"L",
                    "Limon",
                    "https://ksr-ugc.imgix.net/assets/012/381/396/71e7f5d36700a058204368735499bd23_original.JPG?ixlib=rb-2.1.0&crop=faces&w=1552&h=873&fit=crop&v=1463758076&auto=format&frame=1&q=92&s=ac61f95129754ec520bdbdff74e9c0c2",
                    "is a citrus fruit, which is typically round, green in color, 3–6 centimetres (1.2–2.4 in) in diameter, and contains acidic juice vesicles.",
                    "Fruit"},
            {"M",
                    "Mango",
                    "https://www.gimmesomeoven.com/wp-content/uploads/2018/08/How-To-Cut-A-Mango-Tutorial-1.jpg",
                    "a fleshy, oval, yellowish-red tropical fruit that is eaten ripe or used green for pickles or chutneys.\n",
                    "Fruit"},
            {"N",
                    "Number",
                    "https://image.shutterstock.com/image-vector/numbers-colourful-set-vintage-style-260nw-520635451.jpg",
                    "an arithmetical value, expressed by a word, symbol, or figure, representing a particular quantity and used in counting and making calculations and for showing order in a series or for identification.",
                    "Number"},
            {"O",
                    "O",
                    "http://img.businessdictionary.com/share-social/terms/objective.png",
                    "(of a person or their judgment) not influenced by personal feelings or opinions in considering and representing facts.",
                    "Nepal"},
            {"P",
                    "Poems",
                    "https://static.poetryfoundation.org/jstor/i20590218/pages/25.png",
                    "a piece of writing that partakes of the nature of both speech and song that is nearly always rhythmical, usually metaphorical, and often exhibits such formal elements as meter, rhyme, and stanzaic structure.",
                    "Nepal"},
            {"Q",
                    "Quantum Theory",
                    "https://images.slideplayer.com/25/7979430/slides/slide_2.jpg",
                    "a theory of matter and energy based on the concept of quanta, especially quantum mechanics.\n",
                    "Theory"},
            {"R",
                    "React.js",
                    "https://miro.medium.com/max/1200/1*y6C4nSvy2Woe0m7bWEn4BA.png",
                    "React-Is a JavaScript library that helps you build front end web application in a more efficient way.",
                    "JavaScript"},
            {"S",
                    "Sun",
                    "https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/06/12/17/the-sun.jpg",
                    "the star around which the earth orbits.",
                    "Star"},
            {"T",
                    "Time",
                    "https://ep01.epimg.net/elpais/imagenes/2018/10/22/ciencia/1540208830_955987_1540210198_noticia_normal.jpg",
                    "the indefinite continued progress of existence and events in the past, present, and future regarded as a whole.",
                    "Life"},
            {"U",
                    "Universe",
                    "https://www.sciencenews.org/wp-content/uploads/2019/02/022119_EC_expanding-universe_feat.jpg",
                    "all existing matter and space considered as a whole; the cosmos. The universe is believed to be at least 10 billion light years in diameter and contains a vast number of galaxies; it has been expanding since its creation in the Big Bang about 13 billion years ago.",
                    "Universe"},
            {"V",
                    "Vector",
                    "https://www.thoughtco.com/thmb/aq6UPPn8hHXRAlCR7Z9eIz-DiTQ=/2678x2678/smart/filters:no_upscale()/vector-addition-141482002-599f183d9abed50011663dec.jpg",
                    "a quantity having direction as well as magnitude, especially as determining the position of one point in space relative to another.",
                    "Nepal"},
            {"W",
                    "Winning",
                    "https://www.toddytalks.com/images/blog/a12330231ab8631cfb23ffd217e32caa__09a1/zoom668x444z41168cw668.jpg?etag=93ac21111d3a4851d0b74bbe28b7eb96",
                    "Winning-gaining, resulting in, or relating to victory in a contest or competition.",
                    "United States"},
            {"X",
                    "Xbox",
                    "https://compass-ssl.xbox.com/assets/05/b0/05b01a46-58eb-4927-ad21-3c43b545ebaf.jpg?n=X1S-2019_Panes-2-Up-1084_111_570x400.jpg",
                    "Xbox is a gaming console that was create by Microsoft",
                    "United States"},
            {"Y",
                    "Year",
                    "https://img.freepik.com/free-vector/happy-new-year-background_1017-21024.jpg?size=626&ext=jpg",
                    "Year is the time taken by a planet to make one revolution around the sun. ",
                    "Time"},
            {"Z",
                    "Zero",
                    "http://www.sciencekids.co.nz/images/pictures/math/zero.jpg",
                    "0 is 0 (zero) is both a number and the numerical digit used to represent that number in numerals. The number 0 fulfills a central role in mathematics as the additive identity of the integers, real numbers, and many other algebraic structures.",
                    "Nepal"}



    };

    public static ArrayList<Mountain> getListData() {
        Mountain mountain;
        ArrayList<Mountain> list = new ArrayList<>();

        for (String[] mData : data) {
            mountain = new Mountain();
            mountain.setName(mData[0]);
            mountain.setElevation(mData[1]);
            mountain.setPhoto(mData[2]);
            mountain.setDescription(mData[3]);
            mountain.setLocation(mData[4]);

            list.add(mountain);
        }

        return list;
    }

}
