import { createWebHistory, createRouter } from "vue-router";
import type { RouteRecordRaw } from "vue-router";

const routes: Array<RouteRecordRaw> = [
  {
    path: "/",
    redirect: "/projet"
  },

  {
    path: "/projet",
    name: "projet",
    component: () => import("../pages/Home.vue"),
    props: true
  }
];


const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;