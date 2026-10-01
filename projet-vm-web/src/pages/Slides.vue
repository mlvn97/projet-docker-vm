<script setup lang="ts">
import Background from '../components/Background.vue';
import { useRoute } from 'vue-router';
import router from '../router/index.ts';

const route = useRoute();

const num = Number(route.params.num);

function navigate(n: number) {
    router.push("/pages/" + n)
}
</script>

<template>
    <Background></Background>

    <div id="wrapper">
        <div id="frame">
            <img src="/images/slide_1.png" v-if="num == 1">
            <img src="/images/slide_2.png" v-if="num == 2">
            <img src="/images/slide_3.png" v-if="num == 3">
            <img src="/images/slide_4.png" v-if="num == 4">
        </div>

        <div id="buttons">
            <div class="div-buttons" v-if="num == 1" @click="router.push('/projet')">
                <p>Accueil</p>
            </div>
            <div class="div-buttons" v-if="num > 1" @click="navigate(num - 1)">
                <p><</p>
            </div>
            <div class="div-buttons" v-if="num < 4" @click="navigate(num + 1)">
                <p>></p>
            </div>
            <div class="div-buttons" v-if="num == 4" @click="router.push('/projet')">
                <p>Accueil</p>
            </div>
        </div>
    </div>
</template>

<style lang="css">
#wrapper {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    min-height: 90vh;
    padding: 10px;
    gap: 5rem;
}

#frame {
    background-color: #5f5e5e;
    border-radius: 15px;
    padding: 3px;
    overflow: hidden;
    border: 0.8px solid whitesmoke;
    box-shadow: 1px 1px 10px 1px rgba(245, 245, 245, 0.17);
    position: relative;
    width: 950px;
}

#frame img {
    width: 100%;
    height: 100%;
    object-fit: cover;
    border-radius: 13px;
}

#buttons {
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 5rem;
}

.div-buttons {
    background-color: rgba(155, 155, 155, 0.2);
    backdrop-filter: blur(5.5px);       
    border-radius: 50px;
    border: 0.8px solid rgb(209, 209, 209); 
    box-shadow: 1px 1px 10px 1px rgba(245, 245, 245, 0.2);

    display: flex;
    justify-content: center;
    align-items: center;
    cursor: pointer;
    transition: background-color 0.7s ease-out;
    text-decoration: underline;
    width: 150px;
}

.div-buttons:hover {
    background-color: rgba(88, 157, 90, 0.6);
}

p {
    font-size: 2rem;
}
</style>