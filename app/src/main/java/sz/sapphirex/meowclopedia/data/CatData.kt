package sz.sapphirex.meowclopedia.data

import sz.sapphirex.meowclopedia.data.enums.Coat
import sz.sapphirex.meowclopedia.data.enums.Color
import sz.sapphirex.meowclopedia.data.enums.Origin
import sz.sapphirex.meowclopedia.data.enums.Size
import sz.sapphirex.meowclopedia.data.models.Cat
import sz.sapphirex.meowclopedia.data.models.CatImages

val catData: List<Cat> = listOf(
    Cat(0,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/american-shorthair-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/american-shorthair-2-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/american-shorthair-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "American Shorthair",
        Origin.UNITED_STATES,
        Size.MEDIUM_TO_LARGE,
        listOf(Coat.SHORT_HAIR, Coat.DENSE, Coat.HARD, Coat.LUSTROUS),
        "15-17 years",
        "Males: 11 to 15 pounds\n" +
                "Female: 8 to 12 pounds",
        listOf(Color.BLACK, Color.BLUE, Color.BROWN, Color.SILVER, Color.TABBY),
        "The American Shorthair is known for its longevity, robust health, calm disposition, good looks, friendliness and gentleness. It is a true native American breed that comes in a variety of colors, although it does not come in a pointed pattern like that of the Siamese. The best known American Shorthairs are the dramatically marked silver tabbies, which have been popular in commercial advertisements and movies.\n" +
                "\n" +
                "The American Shorthair ranges in size from medium to large. It is well-built and powerful, with a short, dense coat and large, piercing round eyes. This breed is less square in shape and larger than its counterpart, the British Shorthair. It also has a more oblong rather than a round head, larger ears and longer legs. This is a low-maintenance breed that only requires occasional brushing to keep its coat fresh and manage mild shedding."
    ),
    Cat(1,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/british-shorthair-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/british-shorthair-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ngcb1/notWebP",
                "https://www.catbreedslist.com/uploads/cat-pictures/british-shorthair-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "British Shorthair",
        Origin.UNITED_KINGDOM,
        Size.LARGE,
        listOf(Coat.SHORT_HAIR, Coat.DENSE, Coat.PLUSH),
        "12-17 years",
        "Males: 12–18 pounds\n" +
                "Females: 9-15 pounds",
        listOf(Color.BLUE, Color.BROWN, Color.RED, Color.SILVER, Color.CREAM),
        "The British Shorthair, also called the English Cat or simply the “Brit,” is the national cat of the British Isles. This is a compact, muscular and powerful breed that should be \"cobby\" or chunky in appearance. The British Shorthair has a broad chest, short strong legs and large rounded paws. Its tail is thick at the base, round at the tip and plush but not fluffy. The males are almost always larger than the females; this size difference is more easily recognized in British Shorthairs than in most other domestic breeds. Unlike females, mature males tend to develop prominent chubby cheeks, or jowls, which is another distinguishing gender-based feature.\n" +
                "\n" +
                "The British Shorthair – or the “Brit,” as it is sometimes affectionately called - is an easygoing, intelligent, friendly breed. It has been described as being placid, patient and predictable. The British Shorthair’s sweet and gentle nature makes them wonderful, steadfast companions and undemanding family members. They adapt easily to apartment, farm, city or estate living. These are not noisy or pushy cats, although they greatly appreciate and accept affection when it is offered to them."
    ),
    Cat(2,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/cornish-rex-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/cornish-rex-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/cornish-rex-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Cornish Rex",
        Origin.UNITED_KINGDOM,
        Size.SMALLEST_TO_SMALL,
        listOf(Coat.SHORT_HAIR, Coat.EXTREMELY_SOFT, Coat.CURLY, Coat.SILKY),
        "11-14 years",
        "Male: 8 - 10 pounds\n" +
                "Female: 6 - 8 pounds",
        listOf(Color.WHITE, Color.BLACK, Color.BLUE, Color.RED, Color.CREAM, Color.SILVER, Color.CHOCOLATE, Color.LAVENDER),
        "The Cornish Rex is distinguished from all other breeds by its extremely soft, wavy coat and racy type. Smallest to Small; torso long and slender, not tubular; back is naturally arched; shoulders well knit; rump rounded and well muscled. Comparatively small and egg-shaped; length about one-third greater than width; definite whisker break; oval with gently curving outline; muzzle narrowing slightly to rounded end; cheekbones high and prominent; nose Roman with high prominent bridge. Short, extremely soft, silky, and completely free of guard hairs; relatively dense; size and depth of wave may vary.\n" +
                "\n" +
                "The Cornish Rex is a highly intelligent, affectionate and extroverted breed, notwithstanding its somewhat aloof and sophisticated appearance. It is curious, inventive, playful and mischievous by nature, making it an endearing household companion and a wonderful pet. Most Cornish Rex like to play fetch and chase with other pets and with people. They are unusually acrobatic and enjoy leaping onto and off of high places, seemingly simply for the sheer joy of it. The Cornish Rex is an adventurous animal that readily adapts to new situations and environments. It will explore wherever - and whenever - it can. It often will be seen jumping into or onto refrigerators, examining washing machines or climbing into open clothes driers. Some owners consider these antics to be deliberately provocative on the part of their cats, but in a completely fun and happy way. The Cornish Rex is outgoing and people-oriented. It seeks out human companionship and the fellowship of other household animals. Most representatives of this breed make very suitable pets for children or adults who are timid around other animals."
    ),
    Cat(3,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/devon-rex-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/devon-rex-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/devon-rex-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Devon Rex",
        Origin.UNITED_KINGDOM,
        Size.SMALLEST_TO_SMALL,
        listOf(Coat.SHORT, Coat.CURLY, Coat.SILKY, Coat.SOFT),
        "10-15 years",
        "Male: 8 - 10 pounds\n" +
                "Female: 5 - 8 pounds",
        listOf(Color.WHITE, Color.BLACK, Color.BLUE, Color.RED, Color.CREAM, Color.FAWN, Color.CHOCOLATE, Color.LAVENDER),
        "The Devon Rex is a breed of unique appearance. Its large eyes, short muzzle, prominent cheekbones, and huge ears create a characteristic elfin look. Hard and muscular; slender; medium length; broad chest; medium fine boning; body carried high on the legs. Modified wedge; head broad but slightly longer than broad; face full-cheeked with pronounced cheekbones and a whisker break; in profile, nose has strongly marked stop; muzzle short and well developed; prominent whisker break; chin strong and well developed. All colors and patterns including the Himalayan pattern.\n" +
                "\n" +
                "The Devon Rex is an extremely intelligent cat that makes a lively, affectionate companion. They are very creative and are known to invent clever games on their own, to be shared with their human and other household companions whenever anyone will play. Anything that can be picked up or moved becomes a toy or a target to a Devon Rex. They are highly people-oriented and bond very strongly with their owners. For that reason, ownership of a Devon Rex should be considered a lifelong commitment. They give, and expect to receive, a great deal of devotion, attention and affection. The Devon Rex is not well-equipped to survive outdoors due to its short hair coat. These cats should be kept exclusively indoors."
    ),
    Cat(4,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/exotic-shorthair-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/exotic-shorthair-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/exotic-shorthair-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Exotic Shorthair",
        Origin.UNITED_STATES,
        Size.MEDIUM,
        listOf(Coat.DENSE, Coat.PLUSH, Coat.SHORT_HAIR, Coat.SOFT),
        "12-15 years",
        "8-14 pounds",
        listOf(Color.BLACK, Color.BLUE, Color.CHINCHILLA, Color.CHOCOLATE, Color.CREAM, Color.LILAC, Color.RED, Color.SHADED_SILVER, Color.SILVER, Color.WHITE),
        "The Exotic Shorthair is a man-made breed resulting from the cross of Persians with American Shorthairs and other shorthaired cats. The Exotic's body and head-style match that of the Persian, but the breed was separated into its own category in the 1960s. The desired coat is dense, plush and stands away from the body due to the thick undercoat. Because outcrosses are regularly done to Persians, many long-haired kittens occur in Exotic litters. Some associations will register and show these cats as Persians. A bit livelier and more inquisitive than the Persian, Exotics share many of the Persian's gentler personality features.\n" +
                "\n" +
                "Known as the lazy man’s Persian, the Exotic Shorthair has the body type and easygoing nature of the Persian but without the coat length and need for daily grooming. With her thick, dense, plush short hair and round face, the Exotic Shorthair has a soft teddy bear look. This sweet feline is affectionate and loyal. The breed is athletic, fun-loving, yet also quiet and sensitive."
    ),
    Cat(5,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/havana-brown-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1"
            )
        ),
        "Havana Brown",
        Origin.UNITED_KINGDOM,
        Size.SMALL_TO_MEDIUM,
        listOf(Coat.SHORT_TO_MEDIUM, Coat.GLOSSY, Coat.SMOOTH, Coat.SLEEK, Coat.STRAIGHT),
        "10-15 years",
        "Male: 8 - 12 pounds\n" +
                "Female: 6 - 8 pounds",
        listOf(Color.BROWN),
        "The Havana Brown is a small to medium-sized, muscular cat that is one of a number of breeds classified generally as oriental or foreign shorthairs. Its most defining characteristic is its lustrous mahogany coat, which resembles that of a mink in both color and texture. Its fur is fine, short, exceptionally glossy and uniformly a warm, chocolate to chestnut brown. Although ghost markings are acceptable on kittens, adults should be solid (called “self-colored”), with no trace of tabby markings. The Havana Brown’s eyes are oval and a remarkably vivid green. It has a narrow head that is slightly longer than it is wide and tapers to a rounded muzzle with a strong, squared chin. Its whiskers are also brown, complimenting its coat color. When viewed in profile, there is a distinct change in the slope of the Havana’s forehead, called a “stop,” at the level of the eyes. Its ears are large, rounded at the tips and pricked slightly forward, giving this cat an alert and inquisitive expression. The nose leather and paw pads of the Havana are brown with a distinctly rosy flush. Their necks and legs are long and slender, and their paws are small and oval. Males tend to be larger than females, usually weighing between 8 and 10 pounds. Females typically weigh between 6 and 8 pounds.\n" +
                "\n" +
                "The Havana Brown is a graceful, affectionate and highly intelligent cat, with a big personality in a mid-sized package. It is similar in temperament to the Siamese, although it is less vocal and has a softer (and what many consider to be a more pleasing) voice. These are sociable, adaptable, friendly cats that crave human companionship and do not thrive when left unattended for long periods of time. However, they are not pushy or overly demanding of attention."
    ),
    Cat(6,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/japanese-bobtail-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
            )
        ),
        "Japanese Bobtail",
        Origin.JAPAN,
        Size.SMALL,
        listOf(Coat.LONG, Coat.SHORT_HAIR, Coat.SILKY, Coat.SOFT, Coat.STRAIGHT),
        "14-16 years",
        "Male: 7 - 10 pounds\n" +
                "Female: 6 - 8 pounds",
        listOf(Color.BLUE, Color.BROWN, Color.RUDDY, Color.TAN, Color.RED),
        "The Japanese Bobtail is an ancient breed that has existed for centuries in Japan. Cats with short, stubby and/or kinked tails are fairly common on the Asian continent and may share a conformational genetic mutation with the Japanese Bobtail. The most recognizable characteristic of this breed of course is its short, fluffy tail, which typically is carried closely curled upon its rear end, especially when it is resting. The tail is usually about 3 or 4 inches in length and has longer hair than that on the rest of the body, giving it a “pom-pom” appearance that masks the actual deformity of its bone structure. The Japanese Bobtail’s tail is usually flexible only at its base, because the few vertebral bones of the tail are fused. When the Bobtail walks, its tail may be held more upright and erect, rather than tight and curled.\n" +
                "\n" +
                "The Japanese Bobtail is a highly personable cat that loves to be in the company of people. It can be more vocal than many felines, but its voice is softer and more melodious than that of the Siamese and most other exotic oriental shorthairs. The Bobtail makes a bright, affectionate, well-behaved companion both for people and for other pets. Like many other purebred cats, it does not thrive being kept isolated or alone for long periods of time, nor does it do well living in the out-of-doors. The Japanese Bobtail needs to be an intimate, well-integrated part of the family and certainly is deserving of that level of attention and commitment from its owners. The Bobtail is highly adaptable and enjoys a bustling, stimulating living atmosphere. This is the perfect cat breed for homes with lots of children."
    ),
    Cat(7,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/khao-manee-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
            )
        ),
        "Khao Manee",
        Origin.THAILAND,
        Size.SMALL_TO_MEDIUM,
        listOf(Coat.SHORT_HAIR, Coat.SILKY_AND_VERY_DENSE),
        "10-12 years",
        "7 - 11 pounds",
        listOf(Color.WHITE),
        "The Khao Manee (pronounced Cow Maneee) is a rare breed of cat originating in Thailand, and has an ancient ancestry which can be traced back hundreds of years. Known as the “White Gem,” the Khao Manee was through to bring good luck and was a popular breed with Thai royalty. The Khao Manee was said to be kept and bred initially by Siam royals, as was the case with other rare colored cats such as the Siamese. Breeders in Thailand are promoting and breeding the Khao Manee in the effort of preserving its lineage and breed standard. Breeders in the West are still working to promote and establish foundation lines for the Khao Manee.\n" +
                "\n" +
                "The Khao Manee is a small to medium-sized breed, growing to between 10 and 12 inches and weighing between 8 and 10 pounds. Khao Manee has a muscular, athletic body, with a wedge-shaped head and large ears. The nose is prominent with a blunt, rounded tip."
    ),
    Cat(8,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/lykoi-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
            )
        ),
        "Lykoi",
        Origin.UNITED_STATES,
        Size.SMALL_TO_MEDIUM,
        listOf(Coat.SHORT_HAIR, Coat.PARTIALLY_HAIRLESS),
        "12-16 years",
        "Male: 9 - 12 pounds\n" +
                "Female: 6 - 8 pounds",
        listOf(Color.BLACK_ROAN),
        "The Lykoi is a natural mutation from a domestic shorthair that has the appearance of a werewolf. The mutation has occurred in domestic cats over the last 20 years. DNA testing has been done by UC Davis to confirm that the cats do not carry the Sphynx/Devon Rex gene. The Lykoi breed was developed in Vonore, Tennessee and is said to resemble a werewolf. The word \"lykoi\" means 'wolves' in Greek.\n" +
                "\n" +
                "The Lykoi is a small to medium-sized cat weighing between 6-11 pounds. They have lean, athletic bodies with pointed, large ears. Their bodies are longer than their tails as well. The Lykoi is a partially hairless breed of cat with a color that is unique to them. The hair coat is a combination of amelanistic hair and solid black hair. The mix of hair can vary from being almost black to almost white."
    ),
    Cat(9,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/maine-coon-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
            )
        ),
        "Maine Coon",
        Origin.UNITED_STATES,
        Size.LARGE_TO_LARGEST,
        listOf(Coat.LONG_HAIR, Coat.LIGHT_UNDERCOAT, Coat.SILKY, Coat.SOFT),
        "12-15 years",
        "Male: 15-25 pounds, the Maine Coon cat is one of the largest domesticated breeds of felines. Some Male Maine Coon cats can weigh up to 35 lb (15.9 kg).\n" +
                "\n" +
                "Female: 8-12 pounds",
        listOf(Color.BLACK, Color.GOLDEN, Color.GRAY, Color.SILVER, Color.WHITE),
        "Maine Coons are known for their large size, with females averaging up to 16 pounds and males up to 18, with some tipping the scales at 20-plus pounds. With a long, shaggy coat that lays close to the body, a bushy long tail, tufted paw pads and large ears adorned with furry tufts and \"lynx tips\" on top, their build reflects the Maine Coon's origins in the cold Northeast.\n" +
                "\n" +
                "The Maine Coon is known in the cat fancy as a \"gentle giant\", much like the Great Dane is known in the dog fancy by that same nickname. This is an extroverted, outgoing, sociable breed, with a loving nature, a kind disposition and a keen intellect. Most Maine Coons are highly trainable and can easily be taught to walk on a harness and leash. They are affectionate, playful animals that typically get along extremely well with children, other cats and even dogs."
    ),
    Cat(10,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/norwegian-forest-cat-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/norwegian-forest-cat-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/norwegian-forest-cat-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Norwegian Forest Cat",
        Origin.NORWAY,
        Size.LARGE,
        listOf(Coat.LONG_HAIR, Coat.DENSE, Coat.SILKY, Coat.SOFT, Coat.GLOSSY),
        "12-16 years",
        "Male: 12 - 16 pounds\n" +
                "Female: 9 - 12 pounds",
        listOf(Color.WHITE, Color.BLACK, Color.BLUE, Color.RED, Color.CREAM, Color.SILVER, Color.TABBY, Color.CINNAMON),
        "The Norwegian Forest Cat is a strong, solid, muscular cat that is somewhat similar in type to the Maine Coon. It has been suggested that the Norwegian is an early ancestor of the Maine Coon and perhaps of the long-haired Manx variety, as well. Called the “Norsk Skaukatt” in its homeland, this cat has a long, dense double coat, with a coarse outer layer covering a thick, wooly undercoat that makes it virtually water-proof even in the heaviest of rainstorms. Its tufted, lynx-like ears, ruffed neck and long bushy tail provide additional protection against bitter weather. These are big cats. Adult males typically weigh between 10 and 16 pounds; females weigh substantially less. Their hind legs are longer than their front legs, which is one characteristic that distinguishes them from the Maine Coon. Despite its size, the Norwegian Forest Cat has a certain elegance about it. It has a refined, triangular-shaped head with a long, straight face in profile. Its eyes are large, almond-shaped and slanted slightly upward at the outer corners. This breed comes in a wide range of beautiful colors. However, color and pattern are considered secondary to a correct coat and body type. Norwegian Forest Cats do tend to shed, especially during the summer months, although their coat requires only occasional brushing and combing to keep them tidy.\n" +
                "\n" +
                "Norwegian Forest Cats are smart, friendly and playful, much like their probable distant cousins, the Maine Coons. They are inquisitive and have great affection for the outdoors. However, they also greatly enjoy the company of people and other pets. In fact, Norwegian Forest Cats are known to go looking for companionship, if they have been left alone or unattended to by their owners for prolonged periods of time. Norwegians are affectionate but not overly pushy or pestering. They certainly like to cuddle with and be close to their owners, but they are not as clingy or demanding as some other breeds. They also are not an especially loud or vocal breed. Norwegian Forest Cats are patient, stable and even-tempered. They are not easily-stressed, which makes them terrific companions for families with young children."
    ),
    Cat(11,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/oriental-shorthair-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/oriental-shorthair-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/oriental-shorthair-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Oriental",
        Origin.UNITED_STATES,
        Size.SMALL,
        listOf(Coat.SHORT_HAIR, Coat.FINE, Coat.GLOSSY),
        "12-14 years",
        "Male: 8 - 12 pounds\n" +
                "Female: 6 - 8 pounds",
        listOf(Color.WHITE, Color.BLACK, Color.BLUE, Color.CHESTNUT, Color.CREAM, Color.FAWN, Color.CINNAMON, Color.LAVENDER),
        "The Oriental is a svelte cat with long tapering lines, very lithe but muscular. Long and svelte, a distinctive combination of fine bones and firm muscles; shoulders and hips continue same sleek lines of tubular body. Long tapering wedge; no break at whiskers; skull flat; muzzle fine and wedge-shaped; chin and jaw medium size; nose long and straight, no break. Shorthair: short, fine-textured, glossy or satinlike; lying close to body. Longhair: medium length, fine, silky, without downy undercoat; lying close to body; hair is longest on tail. Orientals come in solid, smoke, shaded, bicolor, particolor, and tabby color classes, making possible over 300 possible colors and patterns.\n" +
                "\n" +
                "Orientals are passionate about the people in their lives. They become extremely attached to their humans, so be prepared for a lifetime commitment. It can be very difficult for these cats to adjust to the loss of their family or favorite person. When you are not available to entertain him, an Oriental will divert himself by jumping on top of the refrigerator, opening drawers, seeking out new hideaways to frustrate anyone who might be searching for him, and watching television with clear interest. He can learn to walk on leash, plays fetch with enthusiasm and is usually amenable to living with children, dogs and other cats. In fact, he may even prefer it. The more action the better for this cat. Just make sure that children treat him with the gentle respect he deserves. Entertain him with puzzle toys, teach him tricks, even train him for feline agility."
    ),
    Cat(12,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/persian-cat-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/persian-cat-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/persian-cat-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Persian",
        Origin.IRAN,
        Size.MEDIUM_TO_LARGE,
        listOf(Coat.GLOSSY, Coat.LONG_HAIR, Coat.SILKY),
        "14-15 years",
        "Males: 9-13 pounds\n" +
                "Females: 8-12 pounds",
        listOf(Color.WHITE, Color.BLUE, Color.BLACK, Color.RED, Color.CREAM, Color.CHOCOLATE, Color.LILAC),
        "The Persian, also known as the Persian Longhair, is an elegant, graceful, gentle breed whose most distinguishing characteristics are its remarkable coat and its unique head. Today, the Persian is one of the most popular of all feline breeds due to its exceptional beauty, kind temperament and easy-going disposition. While their basic temperaments have changed little over time, their conformation and overall appearance have changed considerably. Modern Persians are medium to large in size and stocky, with short thick legs, massive rumps and distinctively cobby profiles. Their large, round paws are tufted with fur. The Persian’s head is broad in skull, round and unusually large for the size of its body, while its ears are especially tiny in comparison and are tufted, which is called having “ear furnishings.” The Persian’s eyes are big, round and very expressive. Whatever their color, deepness of eye color is preferred in this breed. The Persian’s open, pansy-like face is famously flat, with a perky up-turned nose and an extremely short muzzle that is barely noticeable. Its neck is short and thick, with a distinctive mane-like ruff, and its tail is short and bushy. The heads and facial features of Persians have become increasingly exaggerated over time.\n" +
                "\n" +
                "The coat of the Persian has also become more exaggerated over the years. It is extraordinarily long, silky, dense, fine and profuse. Persians have an extremely thick, soft undercoat, with a longer outer layer made up of more coarse guard hairs. The Persian’s coat requires daily grooming (including brushing and combing), along with regular bathing, to prevent the development of nasty tangles and mats. This is necessary whether or not the cat is being entered in the show ring. Persians tend to shed year-round, even more so than other long-haired breeds. They should be housed exclusively indoors to protect their prized coats, as well as to protect them from parasites and other perils of outdoor living."
    ),
    Cat(13,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/ragdoll-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/ragdoll-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/ragdoll-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Ragdoll",
        Origin.UNITED_STATES,
        Size.LARGE_TO_LARGEST,
        listOf(Coat.SEMI_LONG, Coat.SILKY, Coat.PLUSH),
        "12-17 years",
        "10-20 pounds",
        listOf(Color.BLUE, Color.CHOCOLATE, Color.CREAM, Color.LILAC, Color.RED),
        "The large, affectionate Ragdoll goes limp with pleasure when you cuddle him in your arms, the trait that led to his name. He’s a big kitty, with males ranging up to 20 pounds, females slightly smaller, starting at 12 pounds and going up to 15 pounds.\n" +
                "\n" +
                "The Ragdoll is a docile, gentle, unusually relaxed animal with a decidedly even disposition. When socialized correctly from birth, they will be friendly and endearing members of the family. Ragdolls can be welcoming to strangers and love being held and snuggled by people of all ages. This breed tends to prefer the company of people more so than that of other pets. They normally are a good pet for young children, as they tolerate and appreciate affection and attention and typically can withstand a child's exploration and potentially unexpected behaviors. Nonetheless, Ragdolls generally prefer calm, rather than rowdy, living environments and are happiest housed entirely indoors. They are great companions for a modern, busy household."
    ),
    Cat(14,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/sphynx-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/sphynx-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ngcb1/notWebP",
                "https://www.catbreedslist.com/uploads/cat-pictures/sphynx-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Sphynx",
        Origin.CANADA,
        Size.SMALL_TO_MEDIUM,
        listOf(Coat.HAIRLESS, Coat.BALD, Coat.SUEDE),
        "12-14 years",
        "Male: 8 - 12 pounds\n" +
                "Female: 6 - 9 pounds",
        listOf(Color.WHITE, Color.BLACK, Color.BLUE, Color.RED, Color.CREAM, Color.CHOCOLATE, Color.LAVENDER),
        "The Sphynx is one of the most unusual and rare of all domestic feline breeds. Its most distinguishing characteristic is that it appears to be entirely hairless. However, most Sphynx do have some degree of short, sparse downy fur that is most noticeable on the ears, muzzle, tail, feet and scrotum. When present, even this fur is barely perceptible to the human eye or to the human touch. The fine fur tends to be more visible on young kittens and then thins or disappears with age. The markings and coloration are highly unique to each Sphynx cat, with color depending entirely upon the pigmentation of its skin. All of the usual domestic cat colors and coat patterns can be found in the Sphynx. The texture of the cat’s skin – which has been said to resemble the fuzz of a peach - feels like soft chamois leather or suede and usually is noticeably warm to the touch. Whiskers and eyebrows may or may not be present, and when present they may be either whole or broken. Kittens are more uniformly wrinkled than are adults, but mature Sphynx should retain some wrinkling, especially around their shoulders and neck.\n" +
                "\n" +
                "The hairless Sphynx is muscular with broad ears and a wide-eyed, friendly expression. This sweet-natured, lively cat is inquisitive and loves being the center of attention. A devoted, affectionate feline, the Sphynx follows her human companions everywhere, purring with delight. This breed does not do well when left alone all day. The Sphynx is a healthy, hardy cat."
    ),
    Cat(15,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/tonkinese-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
                "https://www.catbreedslist.com/uploads/cat-pictures/tonkinese-2-2.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1",
                "https://www.catbreedslist.com/uploads/cat-pictures/tonkinese-2-3.jpg?ezimgfmt=rs:800x450/rscb1/ng:webp/ngcb1"
            )
        ),
        "Tonkinese",
        Origin.CANADA,
        Size.SMALL_TO_MEDIUM,
        listOf(Coat.MEDIUM_SHORT, Coat.SILKY, Coat.SOFT, Coat.PLUSH),
        "14-16 years",
        "Male: 8 - 12 pounds\n" +
                "Female: 6 - 8 pounds",
        listOf(Color.BLUE, Color.FAWN, Color.SILVER, Color.CREAM),
        "Tonkinese cats are generally trim and muscular cats. They are heavier than they appear to be due to their very muscular bodies. They have a distinctive oval shaped paw, and a modified wedge shaped head, with large ears set towards the outside of their head. The most commonly accepted colors are: platinum, champagne, blue, and natural. Typically, solid Tonkinese cats have gold or green eyes, cats with the pointed pattern are blue eyed, and the mink cats have a shade of aquamarine. A great deal of subtle variation exists in colors and patterns, and Tonkinese body color darkens with age to some degree in all patterns. Cats kept in colder climates will typically be darker in their mink or point shading, like their Siamese cousins.\n" +
                "\n" +
                "Tonkinese cats are unusually intelligent, curious, affectionate toward and interested in people. Tonks are playful cats, but not hyperactive, although they can be mischievous if they become lonesome or bored. Some interesting toys and a cat tree, or another Tonkinese, will keep them occupied when you're not around. Unlike most breeds of cat, they are reported to sometimes, even often, engage in fetching, and they can often be found perched on the highest object in the house. Do not be alarmed if your Tonkinese jumps on your shoulders, as the breed is known for their love of heights. Tonkinese are more like Burmese in temperament than Siamese. They are less high strung and demanding. Their voices are also less piercing in most cases than the Siamese, but most Tonks are fairly vocal. Most observers feel they combine the more attractive features of both ancestor breeds."
    ),
    Cat(16,
        CatImages(
            catImages = listOf(
                "https://www.catbreedslist.com/uploads/cat-pictures/york-chocolate-2.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-1",
            )
        ),
        "York Chocolate",
        Origin.UNITED_STATES,
        Size.LARGE_TO_LARGEST,
        listOf(Coat.LONG, Coat.SOFT, Coat.LIGHT_UNDERCOAT),
        "13-15 years",
        "Male: 14 - 18 pounds\n" +
                "Female: 12 - 16 pounds",
        listOf(Color.BLACK),
        "The York Chocolate (or simply York) is an uncommon and relatively recent American breed of show cat, with a long, fluffy coat and a tapered tail and most of them are mostly or entirely chocolate-brown. The breed was named after New York state, where it was established in 1983. This breed was created by color-selecting domestic long-haired cats of mixed ancestry. The breed is not widely recognized by cat registries."
    ),
//    Cat(,
//        CatImages(
//            catImages = listOf(
//                "",
//            )
//        ),
//        "",
//        Origin.,
//        Size.,
//        listOf(Coat.),
//        "",
//        "",
//        listOf(Colors.),
//        ""
//    ),
)