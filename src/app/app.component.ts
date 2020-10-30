import { Component } from '@angular/core';
import { GetApiService } from './get-api.service';
import { Chart } from 'chart.js';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MoneyControl';

  chart: [];

  constructor(private api: GetApiService) {

  }
  ngOnInit() {
    this.api.apiCall().subscribe((data) => {
      console.log("get api data", data);

      let month = [];
      let gastos = [];
      let ganhos = [];

      for (let item in data) {
        month.push(data[item].data);
        gastos.push(data[item].gastos);
        ganhos.push(data[item].ganhos);
      }
      Object.entries(data);
      console.log("teste", month);

      var chart = new Chart('canvas', {
        type: 'bar',
        data: {
          labels: month,
          datasets: [{
            label: "Ganhos",
            data: ganhos,
            backgroundColor: "Green",
            borderColor: "Green",
            hoverBackgroundColor: "Green"
          },
          {
            label: "Gastos",
            data: gastos,
            backgroundColor: "Red",
            borderColor: "Red",
            hoverBackgroundColor: "Red"
          }
          ]
        },
        options: {
          title: {
            display: true,
            text: 'Orçamentos 2020'
          },
          scales: {
            yAxes: [{
              ticks: {
                beginAtZero: true
              }
            }]
          }
        }
      });


    })

  }
}
