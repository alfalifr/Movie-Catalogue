package com.dicoding.mymoviecatalogue.utils

import com.dicoding.mymoviecatalogue.R
import com.dicoding.mymoviecatalogue.model.MoviesEntity
import com.dicoding.mymoviecatalogue.model.TvShowEntity

object DataDummy {

    var title_movies = arrayOf(
        "A Star Is Born (2018)",
        "Alita: Battle Angel (2019)",
        "Aquaman (2018)",
        "Bohemian Rhapsody (2018)",
        "Cold Pursuit (2019)",
        "Glass (2019)",
        "How to Train Your Dragon: The Hidden World (2019)",
        "Avengers: Infinity War (2018)",
        "Spider-Man: Into the Spider-Verse (2018)",
        "Master Z: Ip Man Legacy (2018)"
    )

    var movies_desc = arrayOf(
        "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just " +
                "about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even " +
                "as Ally\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an" +
                " ongoing battle with his own internal demons.",
        "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in " +
                "by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and " +
                "soul of a young woman with an extraordinary past.",
        "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the " +
                "power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people " +
                "and then the surface world. Standing in his way is Arthur Curry, Orm\'s half-human, half-Atlantean brother" +
                "and true heir to the throne.",
        "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the " +
                "music world by storm when they form the rock \'n\' roll band Queen in 1970. Hit songs become instant classics." +
                "When Mercury\'s increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest " +
                "challenge yet – finding a way to keep the band together amid the success and excess.",
        "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son\'s murder. Nels begins a " +
                "vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking\'s " +
                "associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent " +
                "consequences, as he proves that revenge is all in the execution.",
        "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to " +
                "track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy " +
                "presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
        "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, " +
                "elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is " +
                "tested, both dragon and rider must make impossible decisions to save their kind.",
        "As the Avengers and their allies have continued to protect the world from threats too large for any one " +
                "hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, " +
                "his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his " +
                "twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate " +
                "of Earth and existence itself has never been more uncertain.",
        "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson " +
                "\"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
        "Following his defeat by Master Ip, Cheung Tin Chi (Zhang) tries to make a life with his young son in Hong " +
                "Kong, waiting tables at a bar that caters to expats. But it s not long before the mix of foreigners, money, " +
                "and triad leaders draw him once again to the fight."
    )

    var movies_img = arrayOf(
        R.drawable.poster_a_start_is_born,
        R.drawable.poster_alita,
        R.drawable.poster_aquaman,
        R.drawable.poster_bohemian,
        R.drawable.poster_cold_persuit,
        R.drawable.poster_glass,
        R.drawable.poster_how_to_train,
        R.drawable.poster_infinity_war,
        R.drawable.poster_spiderman,
        R.drawable.poster_master_z
    )

    var title_tvshow = arrayOf(
        "Arrow (2012)",
        "Doom Patrol (2019)",
        "Dragon Ball (1986)",
        "Fairy Tail (2009)",
        "Family Guy (1999)",
        "Gotham (2014)",
        "Grey\'s Anatomy (2005)",
        "Hanna (2019)",
        "Marvel\'s Iron Fist (2017)",
        "Naruto Shippūden (2007)"
    )

    var tvshow_desc = arrayOf(
        "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He " +
                "returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a " +
                "bow.",
        "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also " +
                "left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who " +
                "brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what " +
                "they find.",
        "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. " +
                "Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his " +
                "own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical " +
                "Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
        "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she " +
                "meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\'t just any " +
                "ordinary kid, he\'s a member of one of the world\'s most infamous mage guilds: Fairy Tail.",
        "Sick, twisted, politically incorrect and Freakin\' Sweet animated series featuring the adventures of the " +
                "dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant " +
                "but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most " +
                "unpopular girl in town) and Chris (the middle kid, he\'s not very bright but has a passion for movies). The " +
                "final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check " +
                "whilst sipping Martinis and sorting through his own life issues.",
        "Before there was Batman, there was GOTHAM.Everyone knows the name Commissioner Gordon. He is one of the " +
                "crime world\'s greatest foes, a man whose reputation is synonymous with law and order. But what is known of " +
                "Gordon\'s story and his rise from rookie detective to Police Commissioner? What did it take to navigate the " +
                "multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world\'s most " +
                "iconic villains? And what circumstances created them – the larger-than-life personas who would become " +
                "Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
        "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
        "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the " +
                "relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the " +
                "2011 Joe Wright film.",
        "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks" +
                "to reclaim his past and fulfill his destiny.",
        "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around " +
                "an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the " +
                "grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village " +
                "of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few " +
                "(more dangerous) enemies, in the likes of the shinobi organization; Akatsuki."
    )

    var tvshow_img = arrayOf(
        R.drawable.poster_arrow,
        R.drawable.poster_doom_patrol,
        R.drawable.poster_dragon_ball,
        R.drawable.poster_fairytail,
        R.drawable.poster_family_guy,
        R.drawable.poster_gotham,
        R.drawable.poster_grey_anatomy,
        R.drawable.poster_hanna,
        R.drawable.poster_iron_fist,
        R.drawable.poster_naruto_shipudden
    )

    fun listMovie(): List<MoviesEntity> {
        val movies = mutableListOf<MoviesEntity>()
        title_movies.forEachIndexed { index, title ->
            val movie = MoviesEntity(
                title, movies_img[index], movies_desc[index]
            )
            movies.add(movie)


        }
        return movies

    }

    fun listTvShow(): List<TvShowEntity> {
        val tvShows = mutableListOf<TvShowEntity>()
        title_tvshow.forEachIndexed { index, title ->
            val tvShow = TvShowEntity(
                title, tvshow_img[index], tvshow_desc[index]
            )
            tvShows.add(tvShow)


        }
        return tvShows

    }

}