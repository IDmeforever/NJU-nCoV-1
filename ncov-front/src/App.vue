<template>
    <div id="app">
        <Navigation></Navigation>
        <router-view></router-view>
    </div>
</template>

<script>
    import Navigation from './components/Navigation.vue'

    export default {
        name: 'app',
        components: {
            Navigation
        }
    }
</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        padding: 0 30px;
    }
</style>
