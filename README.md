# OpenDota API application

This repository allows you to search for data about all players by id.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)

## Introduction

This is a basic REST API application built using [Spring Boot](https://spring.io/projects/spring-boot) framework and [Maven](https://maven.apache.org). The application allows the user to get information about any artists, albums and tracks of interest to them by sending a request to predefined endpoints.

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot): Web framework for building the REST API.
- [OpenDota API](https://developer.spotify.com/documentation/web-api): An external API for getting information about players, matches, etc.

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java (version 17)
- Maven

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/dedulya1/open_dota_api
    ```

The application will start on `http://localhost:8080`.

## Usage

### Endpoints

- **Getting the request data based on the name and type of the request:** 
  
  ```http
  GET /api/search?id=
  ```

  Retrieves information about a given player:

  Example:
  ```http
  GET /api/search?id=827364621
  ```




 
