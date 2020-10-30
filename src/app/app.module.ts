import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { GetApiService } from './get-api.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyChartComponent } from './Components/my-chart/my-chart.component';
import { HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [GetApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
