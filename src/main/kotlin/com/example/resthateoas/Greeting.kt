package com.example.resthateoas

import com.fasterxml.jackson.annotation.*
import org.springframework.hateoas.*

@Suppress("unused")
class Greeting @JsonCreator constructor(@param:JsonProperty("content") val content: String) :
    RepresentationModel<Greeting>()