<script setup lang="ts">
import Background from "../components/Background.vue";
import router from "../router/index.ts";
</script>

<template>
    <Background></Background>

    <div id="wrapper">
        <div class="frames">
            <h1>Projet DevOps - ESGI</h1>
            <hr>
            <span style="padding-top:2rem">Melvin Didier</span>
            <span>Daniel Loji</span>
            <span style="padding-bottom:2rem">Antoine Coulais</span>
        </div>

        <div class="frames div-buttons" @click="router.push('/pages/1')">
            <p>Démarrer la présentation</p>
        </div>
    </div>
</template>

<style lang="css">
#wrapper {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding: 10px;
    gap: 5rem;
}

.frames {
    background-color: rgba(155, 155, 155, 0.2);
    backdrop-filter: blur(5.5px);       
    border-radius: 50px;
    border: 0.8px solid rgb(209, 209, 209); 
    box-shadow: 1px 1px 10px 1px rgba(245, 245, 245, 0.2);

    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    width: 60%;
}

hr {
    width: 100%;
    margin: 0;
}

h1, p {
    font-size: 3rem;
}

span {
    font-size: 2rem;
    padding: 5px;
}

.div-buttons {
    cursor: pointer;
    transition: background-color 0.7s ease-out;
    text-decoration: underline;
}

.div-buttons:hover {
    background-color: rgba(88, 157, 90, 0.6);
}
</style>