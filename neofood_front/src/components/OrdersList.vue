<template>
    <ion-grid>
        <ion-row class="ion-align-self-center" v-if="isExist">
            <ion-col  size="auto" v-for="(order, key) in list" :key="key">
                <OrderItem :order="order"/>
            </ion-col>
        </ion-row>
    </ion-grid>
</template>

<script>
import { 
    IonGrid, 
    IonRow, 
    IonCol,  
    } from "@ionic/vue";
import OrderItem from "./OrderItem.vue";
export default {
    name: "OrdersList",
    components: {
    IonGrid,
    IonRow,
    IonCol,
    // IonContent,
    OrderItem
  },
    props: {
        list: {
            type: Object,
            default: () => ({})
        }
    },
    computed: {
        isExist() {
            return Boolean(Object.keys(this.list).length);
        }
    }
}
</script>
 