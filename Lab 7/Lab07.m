g = 9.8;
theta = (60);
initialV = 35;

v = [initialV*cosd(theta), initialV*sind(theta)]
tMax = (2*initialV*sind(theta)) / g;

tPoints = linspace(0,tMax,250);

x = (initialV*cosd(theta)*tPoints);
y = (initialV*sind(theta)*tPoints)-(0.5*g*((tPoints).^2)); 
% the./ is used to multiply the values, rather than performing an array
% multiplication

plot(x,y);
title("Projectile Motion");
xlabel("x distance");
ylabel("y distance");

