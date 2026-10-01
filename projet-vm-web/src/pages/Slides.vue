<script setup lang="ts">
import Background from '../components/Background.vue';
import { useRoute } from 'vue-router';

const route = useRoute();

const num = Number(route.params.num);
</script>

<template>
    <Background></Background>

    <img :src="String(num)" v-if="num == 1">
    <img :src="String(num)" v-if="num == 2">
    <img :src="String(num)" v-if="num == 3">
    <img :src="String(num)" v-if="num == 4">
</template>

<style lang="css"></style>