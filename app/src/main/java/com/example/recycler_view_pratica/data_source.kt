package com.example.recycler_view_pratica

class data_source {
    companion object {
        fun createDataSet() : ArrayList<models.Profile> {
            val list = ArrayList<models.Profile>()

            list.add(
                models.Profile(
                    "Fulanin",
                    "Senior",
                    0

                )
            )
            list.add(
                models.Profile(
                    "Cicranin",
                    "Pleno",
                    0

                )
            )
            return list
        }
    }
}