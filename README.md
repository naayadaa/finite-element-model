# finite-element-model
Algorithm of forming finite element model of the wing rib. Generation  finite element model nodes coordinates and finite elements. 
Visualisator  for display of the model. Used JavaFX.

##How it works
Run Main class.
![alt tag](https://github.com/naayadaa/finite-element-model/blob/master/fe1.png)

Write an array of upper X and lower X coordinates in the fields "X upper" and "X lower". Separate coordinates by commas. For example:

```
X upper: 0,100,200,500,1000,1200,1500,1800,1900,2000
X lower: 0,200,300,400,500,1500,2000
```
or
```
X upper 0,100,200,500,900,1200,2000
X lower: 0,100,200,500,1000,1200,1500,1800,1900,2000
```
Write in one coordinate in the field "Y upper" and "Y lower".
![alt tag](https://github.com/naayadaa/finite-element-model/blob/master/fe2.png)
Click "Show model" or "Показать модель". The new window opens for the finite elements model visualisation.
*Ctrl+X - show/hide system of axes;
*Ctrl+V - set camera in the initional position;
*Mouse scrol - zoom;
*Drag the primary mouse button - rotate the view;
*Drag the secondary mouse button - move the view;
![alt tag](https://github.com/naayadaa/finite-element-model/blob/master/fe3.png)
